package com.funtalk.start;

import com.funtalk.scheduler.SmsBossStatusJob;
import com.funtalk.scheduler.SmsResultNoticeJob;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.Timer;

public class StartAll {

    public static Logger logger =Logger.getLogger(StartAll.class);

    Timer bossStatusTimer = new Timer();
    Timer resultNoticeTimer = new Timer();


    /**
     * 单线程模式,如果需要多线程则要使用ScheduledExecutorService
     */
    public void bossStatusStart(SmsBossStatusJob smsBossStatusJob,Long interval){

        if (smsBossStatusJob == null)
            smsBossStatusJob= new SmsBossStatusJob();
        if (interval == null)
            interval=new Long(30000);

        // 前一个任务执行结束后执行下一个 任务执行时间和间隔时间是一个并的关系，取最大
        bossStatusTimer.schedule(smsBossStatusJob ,new Date(),interval);

    }


    public void resultNoticeStart(SmsResultNoticeJob smsResultNoticeJob, Long interval){

        if (smsResultNoticeJob == null)
            smsResultNoticeJob= new SmsResultNoticeJob();
        if (interval == null)
            interval=new Long(30000);

        // 前一个任务执行结束后执行下一个 任务执行时间和间隔时间是一个并的关系，取最大
        resultNoticeTimer.schedule(smsResultNoticeJob ,new Date(),interval);

    }

    public static void main(String[] args){

        StartAll smsAllJob = new StartAll();

        logger.info("启动短信状态查询服务[SmsBossStatusJob,默认参数:最近2小时短信,有任务30秒执行一次,无任务60秒]....");
        smsAllJob.bossStatusStart(null,null);
        logger.info("启动短信状态查询服务[SmsBossStatusJob]成功...！");

        logger.info("启动短信结果通知任务[SmsResultNoticeJob,默认参数:有任务30秒执行一次,无任务60秒]....");
        smsAllJob.resultNoticeStart(null,null);
        logger.info("启动短信结果通知任务[SmsResultNoticeJob]成功...！");

        logger.info("启动发送短信服务[MqttClient]....");
        String topic = "/+/device";
        String clientid = "ftk_server_listener_894";
        MqttClient.start(topic, clientid);
        logger.info("启动发送短信服务[MqttClient]成功...！");


/*        for(int i=0;i<120;i++) {
            Thread.sleep(1000);
            System.out.println("-------->" + i);
        }
        // 停止定时任务
        smsAllJob.bossStatusTimer.cancel();
        smsAllJob.resultNoticeTimer.cancel();*/

    }

}
