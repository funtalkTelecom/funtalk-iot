package com.funtalk.start;

import com.funtalk.mapper.TbOPhoneMapper;
import com.funtalk.mapper.TbSPhoneMapper;
import com.funtalk.mapper.TbSSubtaskMapper;
import com.funtalk.mapper.TbSTaskMapper;
import com.funtalk.pojo.TbOPhone;
import com.funtalk.pojo.TbSTask;
import com.funtalk.util.MBSessionFactory;
import com.funtalk.vo.TbOPhoneCount;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.*;

public class ResScheduling {

    public static Logger logger= Logger.getLogger(ResScheduling.class);


    public static void  scheduling(){

        long startTime = System.currentTimeMillis();//获取当前时间

        int subtaskcounts =0;
        int needPhones=0;

        SqlSession sqlSession = MBSessionFactory.getSession();

        TbSTaskMapper taskMapper  =sqlSession.getMapper(TbSTaskMapper.class);
        TbSSubtaskMapper subtaskMapper =sqlSession.getMapper(TbSSubtaskMapper.class);
        TbOPhoneMapper tbOPhoneMapper =sqlSession.getMapper(TbOPhoneMapper.class);
        TbSPhoneMapper tbSPhoneMapper =sqlSession.getMapper(TbSPhoneMapper.class);



/*        // 测试代码
        List<TbOPhoneCount> phoneCounts=tbOPhoneMapper.getPhoneCounts(100000);

        logger.info("------------------->"+phoneCounts.size());

        for (TbOPhoneCount onePhoneCount: phoneCounts){

            logger.info("----------->"+onePhoneCount.getOrderId()+"----"+onePhoneCount.getServiceId()
                    +"--pre--"+onePhoneCount.getPreValue()
                    +"--cur--"+onePhoneCount.getCurValue()
                    +"--next--"+onePhoneCount.getNextValue());

        }
        */

       //获取还未分配的任务  tb_s_task 的state =0
       List<TbSTask> tbSTasks=taskMapper.getNoAssignTasks();

        for (TbSTask oneTask: tbSTasks){

          //  List<TbSSubtask>  tbSSubtasks= subtaskMapper.getNoassignByTaskid(oneTask.getTaskId());

         //   subtaskcounts=tbSSubtasks.size();

            List<TbOPhoneCount> phoneCounts=tbOPhoneMapper.getPhoneCounts(subtaskcounts);


            for (TbOPhoneCount onePhoneCount: phoneCounts){

                if (onePhoneCount.getCurValue()>=subtaskcounts){

                    // -1 为更新taskid的所有记录
         //           subtaskMapper.upadtePhoneA(oneTask.getTaskId(),onePhoneCount.getServiceId(),-1);

                    tbOPhoneMapper.updateUseCount(onePhoneCount.getOrderId(),subtaskcounts);

                    subtaskcounts=0;
                    break;
                }

                // 在没有提交的情况下， 如果taskid 部分更新，需要测试后续更新是否正确
         //       subtaskMapper.upadtePhoneA(oneTask.getTaskId(),onePhoneCount.getServiceId(),onePhoneCount.getCurValue());

                tbOPhoneMapper.updateUseCount(onePhoneCount.getOrderId(),onePhoneCount.getCurValue());

                subtaskcounts=subtaskcounts-onePhoneCount.getCurValue();

            }


            if (subtaskcounts>0){

                // 目前按每张卡订购5元100条的包使用；但最终的每天发送量还是要以day_limit为准，目前暂定 day_limit=5
                needPhones= subtaskcounts/5+1;  // 取整加1  取整时不会四舍五入

                List<String> newPhones= tbSPhoneMapper.getNoUsePhones(needPhones);

                for (String ophone :newPhones){

                    TbOPhone tbOPhone =new TbOPhone();

                    tbOPhone.setServiceId(ophone);
                    tbOPhone.setCustId("leyu");
                    tbOPhone.setDayLimit(5);
                    tbOPhone.setPackageCount(100);
                    tbOPhone.setDayUsed(subtaskcounts-5 > 0 ? 5:subtaskcounts);
                    tbOPhone.setCreateTime(new Date());

                    tbOPhoneMapper.insert(tbOPhone);
           //         subtaskMapper.upadtePhoneA(oneTask.getTaskId(),ophone,subtaskcounts-5 > 0 ? 5:subtaskcounts);

                    tbSPhoneMapper.updateUseState(ophone);

                    subtaskcounts=subtaskcounts-5;

                    if(subtaskcounts<=0)
                        break;

                }

            }

            // 更新 tb_s_task 的state =1   已分配任务
            taskMapper.updateYesAssignTask(oneTask.getTaskId());

            sqlSession.commit();

        }

        sqlSession.commit();  // 最后一定要提交，否则上面的更新没有效果
        sqlSession.close();


        long endTime = System.currentTimeMillis();
        logger.info("程序运行时间："+(endTime-startTime)+"ms");

    }


    public static void main(String[] args) {

     //   scheduling();

/*        Integer  subtaskcounts =new Integer(29);

        int needPhones=subtaskcounts/10+1;

        logger.info("------------>"+needPhones);*/


        String userlabel="12345678998765432100";
        long start = 0;
        long end = 0;
        long used=0;
        // 先垃圾回收
        System.gc();
        start = Runtime.getRuntime().freeMemory();    // 单位 byte

        System.out.println("---start------>"+start);
        HashMap map = new HashMap();
        Hashtable hashtable =new Hashtable();

        for (int i = 0; i < 10000; i++) {
            hashtable.put("1111,2222,3333"+String.valueOf(i), userlabel);
        }

        end = Runtime.getRuntime().freeMemory();



        System.out.println("---end-------->"+end);

        used =(start - end)/1024/1024;
        System.out.println("一个HashMap对象占内存:" + used );

        long startTime = System.currentTimeMillis();//获取当前时间


        System.out.println("--------------->"+hashtable.get("1111,2222,333310001"));

        long endTime = System.currentTimeMillis();
        logger.info("程序运行时间："+(endTime-startTime)+"ms");

    }
}
