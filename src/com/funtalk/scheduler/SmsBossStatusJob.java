package com.funtalk.scheduler;

import com.funtalk.mapper.BfCdmaSmCallTMapper;
import com.funtalk.mapper.TbSTaskAMapper;
import com.funtalk.pojo.BfCdmaSmCallT;
import com.funtalk.pojo.TbSTaskA;
import com.funtalk.pojo.TbSTaskAExample;
import com.funtalk.util.SessFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.*;

public class SmsBossStatusJob extends TimerTask {

    Logger  logger =Logger.getLogger(SmsBossStatusJob.class);

    /**
     * 每隔30s查询一次
     * 查询1天内模组发送成功的订单在boss系统中的记录  查到,更新为4
     * developed by simple.
     */

    public static String timeFlag="0";
    public static int adjustNum=-2;


    public  void run(){

        Calendar calendar;
        List<TbSTaskA> tbSTaskAList =new ArrayList<TbSTaskA>();

        SqlSession  iotSession= SessFactory.getSession("iot");
        SqlSession  acctSession= SessFactory.getSession("acct");



        TbSTaskAMapper  tbSTaskAMapper = iotSession.getMapper(TbSTaskAMapper.class);
        BfCdmaSmCallTMapper bfCdmaSmCallTMapper = acctSession.getMapper(BfCdmaSmCallTMapper.class);

        Map taskMap =new HashMap();

        TbSTaskAExample tbSTaskAExample;
        TbSTaskAExample.Criteria  criteria1;

        BfCdmaSmCallT bfCdmaSmCallT;

        try {

            tbSTaskAExample =new TbSTaskAExample();
            criteria1 =tbSTaskAExample.createCriteria();
            //模组上报状态  2 成功 3 失败  -5 不明原因失败
            criteria1.andStateIn(new ArrayList<String>(Arrays.asList("2","3","-5")));

            calendar = Calendar.getInstance();
            if ("0".equals(timeFlag))
                calendar.add(Calendar.HOUR_OF_DAY,adjustNum);
            else if ("1".equals(timeFlag))
                calendar.add(Calendar.DAY_OF_MONTH, adjustNum);
            else if ("2".equals(timeFlag))
                calendar.add(Calendar.MONTH, adjustNum);
            else return;

            // 确定需要查询详单的任务   以模组上报时间确定范围
            criteria1.andSendEndTimeGreaterThan(calendar.getTime());

            calendar.setTime(new Date());
            calendar.add(Calendar.MINUTE, -12); // 12分钟之前的记录
            criteria1.andSendEndTimeLessThan(calendar.getTime());

            tbSTaskAList=tbSTaskAMapper.selectByExample(tbSTaskAExample);

            if (tbSTaskAList.size()==0){
                logger.info("--Status Check: No Data,Sleeping 60s."+Thread.currentThread().getName());
                Thread.sleep(60000);
            }

            for (TbSTaskA tbSTaskA :tbSTaskAList){

                if (tbSTaskA.getPhoneA() !=null && tbSTaskA.getPhoneA().length()>0
                        && tbSTaskA.getPhoneB() !=null && tbSTaskA.getPhoneB().length()>0) {

                    taskMap.put("taskId",tbSTaskA.getTaskId());

                    bfCdmaSmCallT = new BfCdmaSmCallT();

                    calendar.setTime(tbSTaskA.getSendEndTime());  //设置查询时间为发送时间
                    calendar.add(Calendar.DAY_OF_MONTH, -1);//发送时间减1天
                    bfCdmaSmCallT.setBeginDate(calendar.getTime());

                    calendar.add(Calendar.DAY_OF_MONTH, 3);
                    bfCdmaSmCallT.setEndDate(calendar.getTime());

                    bfCdmaSmCallT.setServiceId(tbSTaskA.getPhoneA());
                    bfCdmaSmCallT.setCallPhone(tbSTaskA.getPhoneB());

                    List<BfCdmaSmCallT> bfCdmaSmCallTList = bfCdmaSmCallTMapper.selectSmsDispatch(bfCdmaSmCallT);


                    calendar.setTime(new Date());
                    calendar.add(Calendar.DAY_OF_MONTH,-1);

//                    SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                    logger.info("--------------"+df.format(calendar.getTime()));

                    // 模组发送成功   and 过去xx小时内有话单  更新为4
                    // 模组发送成功   and 过去xx小时内无话单  更新为5
                    // 模组发送失败3  and 过去xx小时内无话单  更新为6
                    // 模组发送失败-5 and 过去xx小时内无话单  更新为7
                    if (bfCdmaSmCallTList.size()>0){

                        taskMap.put("state","4");
                        tbSTaskAMapper.updateStatus(taskMap);  // boss收到详单,更新为发送成功！

                    }else if (tbSTaskA.getCreateTime() != null &&
                            tbSTaskA.getCreateTime().getTime()<calendar.getTime().getTime()){

                        if (tbSTaskA.getState().equals("2"))
                            taskMap.put("state","5");
                        else if (tbSTaskA.getState().equals("3"))
                            taskMap.put("state","6");
                        else if (tbSTaskA.getState().equals("-5"))
                            taskMap.put("state","7");

                        tbSTaskAMapper.updateStatus(taskMap);

                    }

                    iotSession.commit();
                }
            }

        }catch (Exception e){

            logger.info("--StatusCheck: An error occurred. cause:"+e.getMessage());


        }finally {

            if (iotSession != null){
                iotSession.commit();
                iotSession.close();
            }

            if (acctSession !=null)
                acctSession.close();
        }

    }

}
