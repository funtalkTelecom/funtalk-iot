package com.funtalk.service;

import com.funtalk.pojo.SendInfoEntity;
import com.funtalk.mapper.TbOErrorMapper;
import com.funtalk.mapper.TbOModelRecordMapper;
import com.funtalk.mapper.TbSCardinfoMapper;
import com.funtalk.mapper.TbSTaskAMapper;
import com.funtalk.pojo.*;
import com.funtalk.util.SessFactory;
import com.funtalk.util.StringUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MqttService {

    Logger logger =Logger.getLogger(MqttService.class);

    // public  static DateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    public  static DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");


    public void initializeCardInfo(List<String>  iccidList){

        SqlSession sqlSession = null;

        try {
            sqlSession = SessFactory.getSession("iot");
            TbSCardinfoMapper tbSCardinfoMapper = sqlSession.getMapper(TbSCardinfoMapper.class);

            tbSCardinfoMapper.recoverToInit(iccidList);
            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    public List<TbSTaskA> getRelevantTasks(String cardId){

        SqlSession sqlSession = null;
        List<TbSTaskA>  tbSTaskAList;

        try {
            sqlSession = SessFactory.getSession("iot");
            TbSTaskAMapper tbSTaskAMapper = sqlSession.getMapper(TbSTaskAMapper.class);

            tbSTaskAList = tbSTaskAMapper.selectRelevantTasks(cardId);

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return tbSTaskAList;

    }

    public void updateTaskStateByiId(Integer taskId){

        SqlSession sqlSession = null;

        try {
            sqlSession = SessFactory.getSession("iot");
            TbSTaskAMapper tbSTaskAMapper = sqlSession.getMapper(TbSTaskAMapper.class);

            tbSTaskAMapper.updateTaskStateByiId(taskId);

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }


    public List<TbSCardinfo> getRelevantCardInfo(String iccId,String seedIccId){

        SqlSession sqlSession = null;
        List<TbSCardinfo>  tbSCardinfoList;

        try {
            sqlSession = SessFactory.getSession("iot");
            TbSCardinfoMapper tbSCardinfoMapper = sqlSession.getMapper(TbSCardinfoMapper.class);

            tbSCardinfoList = tbSCardinfoMapper.selectRelevantCardInfo(iccId,seedIccId);

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return tbSCardinfoList;

    }


    public void updateStateByOrderAndPhone(String orderNo,List phoneList, String state){

        SqlSession sqlSession = null;

        logger.info("----o---->"+orderNo+"--p--"+phoneList.toString()+"--s--"+state);

        try {
            sqlSession = SessFactory.getSession("iot");
            TbSTaskAMapper tbSTaskAMapper = sqlSession.getMapper(TbSTaskAMapper.class);

            tbSTaskAMapper.updateStateByOrderAndPhone(orderNo, phoneList, state);
            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }


    public List<TbSCardinfo> getCardInfoByIccidList(List delList){

        SqlSession sqlSession = null;
        List<TbSCardinfo>  tbSCardinfoList;

        try {
            sqlSession = SessFactory.getSession("iot");
            TbSCardinfoMapper tbSCardinfoMapper = sqlSession.getMapper(TbSCardinfoMapper.class);

             tbSCardinfoList= tbSCardinfoMapper.selectByIccidList(delList);

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return tbSCardinfoList;

    }


    public void updateByIccid(TbSCardinfo tbSCardinfo){

        SqlSession sqlSession = null;

        try {
            sqlSession = SessFactory.getSession("iot");
            TbSCardinfoMapper tbSCardinfoMapper = sqlSession.getMapper(TbSCardinfoMapper.class);

            tbSCardinfoMapper.updateByIccid(tbSCardinfo);
            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }


    public void updateCardIdByIccid(String cardId,String iccid){

        SqlSession sqlSession = null;

        try {
            sqlSession = SessFactory.getSession("iot");
            TbSCardinfoMapper tbSCardinfoMapper = sqlSession.getMapper(TbSCardinfoMapper.class);

            tbSCardinfoMapper.updateCardId(cardId,iccid);
            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    /*
     * 切卡条件：有未发送的短信任务则切, 否则不切，继续上报！
     * 如果要切，查找资源，有资源可用，分配到未发送的任务中，更新短信任务和资源状态，没有资源可用，继续上报！
     */
    public synchronized void switchCard(SendInfoEntity data,TbSCardinfo tbSCardinfo,TbSCardinfo tbSCardinfoSeed){

        SqlSession sqlSession=null;
        String  custId="";
        String  cityCode="";
        String originalIccid =tbSCardinfo.getIccidMaster();
        System.out.println("==INTO==switch-card==thread:"+Thread.currentThread().getName()+",old iccid:"+originalIccid);

        TbSTaskA sendTask;
        TbSCardinfo idleCardinfo;

        Map<String,Object> taskParamMap;

        DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        try{

          sqlSession = SessFactory.getSession("iot");

          TbSCardinfoMapper  tbSCardinfoMapper = sqlSession.getMapper(TbSCardinfoMapper.class);
          TbSTaskAMapper     tbSTaskAMapper    = sqlSession.getMapper(TbSTaskAMapper.class);

          List<TbSTaskA> tbSTaskAList =  tbSTaskAMapper.selectUndealtTask();

          if (tbSTaskAList.size()>0){

             sendTask=tbSTaskAList.get(0);

             custId = StringUtil.isNotEmpty(sendTask.getCustId())? sendTask.getCustId():"";
             cityCode= StringUtil.isNotEmpty(sendTask.getCityA())? sendTask.getCityA():"";

             List<TbSCardinfo> tbSCardinfoList =  tbSCardinfoMapper.selectIdleBusinessIccid(custId,cityCode);

             if (tbSCardinfoList.size()>0) {

                 idleCardinfo = tbSCardinfoList.get(0);

                 //  tbSCardinfoSeed.getCardId() 改为 data.getCardId()
                 idleCardinfo.setCardId(data.getCardId());
                 idleCardinfo.setSeedData(tbSCardinfoSeed.getChangeData());  //seedCardData = 种子卡的changeData
                 idleCardinfo.setBelongSeed(tbSCardinfoSeed.getIccidMaster());

                 //日发送量和月发送量后面可以放到上报发送结果的更新中！
                 idleCardinfo.setDayUse(idleCardinfo.getDayUse()+1);
                 idleCardinfo.setMonthUse(idleCardinfo.getMonthUse()+1);
                 idleCardinfo.setUseTime(new Date());
                 idleCardinfo.setIfUse("1");

                 tbSCardinfoMapper.updateByIccid(idleCardinfo);

                 taskParamMap =new HashMap<>();

                 taskParamMap.put("taskId",sendTask.getTaskId());   // 更新记录的主键
                 taskParamMap.put("state","1");
                 taskParamMap.put("orderNo",sdf.format(new Date().getTime())+(int)((Math.random()*9+1)*100000)); //orderNo
                 taskParamMap.put("phoneA",idleCardinfo.getServiceId());
                 taskParamMap.put("cityA",idleCardinfo.getCityA());
                 taskParamMap.put("iccid",idleCardinfo.getIccidMaster());
                 taskParamMap.put("cardId",idleCardinfo.getCardId());
                 taskParamMap.put("serviceKind",idleCardinfo.getServiceKind());
                 taskParamMap.put("sendBeginTime",new Date());

                 tbSTaskAMapper.updateStatus(taskParamMap);
                 sqlSession.commit();

                 originalIccid = idleCardinfo.getIccidMaster();  // 新的ICCID
                 //切卡时 如果是种子卡切业务卡 则lastDel置""
                 if ("1".equals(tbSCardinfo.getIfSeed()))
                     data.setLastDel("");
                 else
                     data.setLastDel(tbSCardinfo.getDeleteData());

                 createResultData(data, idleCardinfo, "2");

                 return;
             }

          }

            // 没有任务 不切卡     继续上报
            // 有任务 没资源 不切卡 继续上报

             if ("1".equals(tbSCardinfo.getIfSeed()))
                 createResultData(data,tbSCardinfo,"1");
             else
                 createResultData(data,tbSCardinfo,"3");

         System.out.println("==OUT===switch-card==thread:"+Thread.currentThread().getName()+",new iccid:"+originalIccid);

         } finally {

            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }


    public  void sendMessage(SendInfoEntity data,TbSCardinfo tbSCardinfo,TbSCardinfo tbSCardinfoSeed){

        SqlSession sqlSession=null;

        Map  taskParamMap;
        TbSTaskA sendTask;
        TbSTaskAMapper tbSTaskAMapper;
        List<TbSTaskA> tbSTaskAList;
        ArrayList<String> pList = new ArrayList<String>();
        ArrayList<String> mList = new ArrayList<String>();

        try{

             sqlSession = SessFactory.getSession("iot");
             tbSTaskAMapper = sqlSession.getMapper(TbSTaskAMapper.class);
             // 将card_id的取值从tbSCardinfo.getCardId() 换成 data.getCardId()
             tbSTaskAList =  tbSTaskAMapper.selectProcessingTask(data.getCardId());

             if (tbSTaskAList.size()>0){

                 sendTask= tbSTaskAList.get(0);

                 taskParamMap =new HashMap<>();
                 taskParamMap.put("taskId",sendTask.getTaskId());

                 if (tbSCardinfo.getIccidMaster().equals(sendTask.getIccid())){  // 分配执行任务的iccid要和此处上报的iccid一致

                     taskParamMap.put("state","12");
                     tbSTaskAMapper.updateStatus(taskParamMap);
                     sqlSession.commit();

                     data.setOrderno(sendTask.getOrderNo());
                     data.setSms_phone(sendTask.getPhoneA());
                     data.setService_kind(sendTask.getServiceKind());

                     pList.add(sendTask.getPhoneB());
                     data.setPhone_Cnt("1");
                     data.setPhone_list(pList);
                     mList.add(sendTask.getMsg());
                     data.setSms_msg(mList);
                     data.setMessage_Cnt("1");

                     createResultData(data,tbSCardinfo,"2");

                 }else { // 解决下发切卡指令后，模组切卡失败的情况  此时需要把之前分配的任务清空初始化

                     taskParamMap.put("state","0");
                     taskParamMap.put("orderNo","");
                     taskParamMap.put("phoneA","");
                     taskParamMap.put("iccid","");
                     taskParamMap.put("cardId","");
                     taskParamMap.put("serviceKind","");
                     tbSTaskAMapper.updateStatus(taskParamMap);
                     sqlSession.commit();

                     switchCard(data, tbSCardinfo, tbSCardinfoSeed);

                 }

             }else{

                 switchCard(data, tbSCardinfo, tbSCardinfoSeed);

             }



        } finally {

            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }


    // 默认继续上报 createResultData(data,tbSCardinfo,"1");
    public  void  createResultData(SendInfoEntity data, TbSCardinfo tbSCardinfo, String cmd){

        data.setCmd(cmd);

        data.setIccId(tbSCardinfo.getIccidMaster());
        data.setSeedCardData(tbSCardinfo.getSeedData());

        if (StringUtil.isNotEmpty(tbSCardinfo.getData1()) ) data.setAddData1(tbSCardinfo.getData1());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData2()) ) data.setAddData2(tbSCardinfo.getData2());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData3()) ) data.setAddData3(tbSCardinfo.getData3());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData4()) ) data.setAddData4(tbSCardinfo.getData4());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData5()) ) data.setAddData5(tbSCardinfo.getData5());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData6()) ) data.setAddData6(tbSCardinfo.getData6());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData7()) ) data.setAddData7(tbSCardinfo.getData7());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData8()) ) data.setAddData8(tbSCardinfo.getData8());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData9()) ) data.setAddData9(tbSCardinfo.getData9());
        if (StringUtil.isNotEmpty(tbSCardinfo.getData10())) data.setAddData10(tbSCardinfo.getData10());

        data.setChangeData(tbSCardinfo.getChangeData());
        data.setDelData(tbSCardinfo.getDeleteData());

        data.setTimeStart(sdf.format(new Date().getTime() + 1 * 1000 * 1));
        data.setTimeRep(sdf.format(new Date().getTime() + 60 * 1000 * 1));
        data.setNetword_type("2");

    }



    public  void insertError(TbOError tbOError){

         SqlSession sqlSession = null;

         try {
             sqlSession = SessFactory.getSession("iot");
             TbOErrorMapper tbOErrorMapper = sqlSession.getMapper(TbOErrorMapper.class);
             tbOErrorMapper.insertSelective(tbOError);
             sqlSession.commit();

         } finally {
             if (sqlSession != null) {
                 sqlSession.close();
             }
         }
     }

    public void insertCommunicationRecord(TbOModelRecord tbOModelRecord){

        SqlSession sqlSession = null;

        try {
            sqlSession = SessFactory.getSession("iot");
            TbOModelRecordMapper tbOModelRecordMapper = sqlSession.getMapper(TbOModelRecordMapper.class);
            tbOModelRecordMapper.insertSelective(tbOModelRecord);
            sqlSession.commit();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }



}
