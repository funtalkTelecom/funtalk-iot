package com.funtalk.scheduler;

import com.alibaba.fastjson.JSONObject;
import com.funtalk.mapper.BfCdmaSmCallTMapper;
import com.funtalk.mapper.TbSTaskAMapper;
import com.funtalk.pojo.SmsNotice;
import com.funtalk.pojo.TbSTaskA;
import com.funtalk.util.DateUtil;
import com.funtalk.util.HttpClient4;
import com.funtalk.util.SessFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import org.safehaus.uuid.UUID;
import org.safehaus.uuid.UUIDGenerator;

import java.util.*;

public class SmsResultNoticeJob extends TimerTask {

    Logger logger = Logger.getLogger(SmsResultNoticeJob.class);

    @Override
    public void run() {

        SqlSession sqlSession=null;
        String smsNoticeSeq="",smsNoticeBack="",state="2",stateMsg="";

        try {

            sqlSession= SessFactory.getSession("iot");
            TbSTaskAMapper tbSTaskAMapper = sqlSession.getMapper(TbSTaskAMapper.class);

            UUIDGenerator generator=UUIDGenerator.getInstance();
            List<TbSTaskA> subTasks =new ArrayList<TbSTaskA>();

            Map<String,Object> paramMap= new HashMap<>();
            paramMap.put("json","");

//            logger.info("Now is:"+ DateUtil.formatFullDate(new Date())+",perform notice for sms result.");
            subTasks=tbSTaskAMapper.getNeedNoticeSms();

            if (subTasks.size()==0) {
                logger.info("--Result Notice: No Data,Sleeping 60s."+Thread.currentThread().getName());
                Thread.sleep(60000);
            }

            for (TbSTaskA subTask :subTasks){

                UUID  uuid   = generator.generateTimeBasedUUID();         //基于时间版本
                smsNoticeSeq = uuid.toString().replaceAll("-", ""); //36位的流水

                SmsNotice smsNotice =new SmsNotice();

                smsNotice.setUid(smsNoticeSeq);
                smsNotice.setMobile(subTask.getPhoneB());
                smsNotice.setReqseq(subTask.getReqSeq());

                if ("4".equals(subTask.getState())) {
                    state = "1";
                    stateMsg = "发送成功!";
                }else
                    stateMsg="发送失败，用户未收到!";


                smsNotice.setState(state);
                smsNotice.setStatemsg(stateMsg);
                smsNotice.setBacktime(DateUtil.formatFullDate(new Date()));

                JSONObject json=new JSONObject();
                paramMap.put("json",json.toJSONString(smsNotice));

                try {

                    smsNoticeBack= HttpClient4.doPost(subTask.getNoticeUrl(),paramMap);

                    subTask.setNoticeState("1");
                    subTask.setNoticeSeq(smsNoticeSeq);
                    subTask.setNoticeTime(new Date());
                    subTask.setNoticeBack(smsNoticeBack.substring(0,smsNoticeBack.length()>180? 180 : smsNoticeBack.length()));
                    tbSTaskAMapper.updateNoticeStatus(subTask);

                    sqlSession.commit();

                } catch (Exception e) {

                    logger.error("--Result Notice: An error occurred. cause:" + e.toString());
                    subTask.setNoticeState("2");
                    subTask.setNoticeSeq(smsNoticeSeq);
                    subTask.setNoticeTime(new Date());
                    subTask.setNoticeBack(smsNoticeBack.substring(0,smsNoticeBack.length()>180? 180 : smsNoticeBack.length()));
                    tbSTaskAMapper.updateNoticeStatus(subTask);

                    sqlSession.commit();

                }
            }

        }catch (Exception e){

            e.printStackTrace();

        }finally {

            if (sqlSession !=null ){

                sqlSession.commit();
                sqlSession.close();

            }

        }

    }
}
