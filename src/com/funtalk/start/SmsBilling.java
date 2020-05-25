package com.funtalk.start;

import com.funtalk.mapper.*;
import com.funtalk.pojo.*;
import com.funtalk.util.SessFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class SmsBilling {

    public static Logger logger= Logger.getLogger(SmsBilling.class);

    /*
       实时计算短信账单费用，实时销账，生成相关表记录;
       1.从tb_b_subtaskresult表中取state=4的记录 // 查询 state=4(发送成功)  ORDER BY create_time  每次200条
       2.将账单生成到tb_u_bill表;
       3.根据tb_s_billmode表中配置的销账方式,对上面的账单做销账处理,批价参数配置:
         // 按employeeId批价, 需要配置cust_id,employee_id两个字段,
         // 按custId批价,只需要配置cust_id字段, employee_id字段不用配置;
       4.生成销账日志,更新账本表;
       5.更新账单表,更新subtaskresult的state=11.
     */

public  static void calculate(){

    SqlSession sqlSession1=null;
    SqlSession sqlSession2=null;
    String info;

    Map<String, TbSBillmode> modeMap= new HashMap<>();

    try {

        sqlSession1 = SessFactory.getSession("iot");

        // mybatis中默认开启事务，且不会自动提交，如果是mysql数据库，则事务等级为4 =REPEATABLE-READ
        logger.info("----whether auto submit----->" + sqlSession1.getConnection().getAutoCommit());
        logger.info("----transaction level------->" + sqlSession1.getConnection().getTransactionIsolation());

        TbSBillmodeMapper tbSBillmodeMapper =sqlSession1.getMapper(TbSBillmodeMapper.class);

        List<TbSBillmode> tbSBillmodeList = tbSBillmodeMapper.selectAll();

        modeMap = tbSBillmodeList.stream().collect(Collectors.toMap(
                v ->{
                    if (v.getEmployeeId() !=null && v.getEmployeeId() !=0)
                        return v.getCustId()+"-"+v.getEmployeeId();
                    else
                        return  v.getCustId();
                }, v -> v));


        } catch (Exception e) {

            if (sqlSession1 != null)
                sqlSession1.close();

        }finally {

            if (sqlSession1 != null)
                sqlSession1.close();
        }

    try {

        sqlSession2 = SessFactory.getSession("iot");
        // 使用方式1
        // List<TbSSubtaskResult> tbSSubtaskResult= sqlSession.selectList("com.ftk.mapper.TbSSubtaskResultMapper.selectByState","2");
        //使用方式2
        TbSSubtaskResultMapper taskResultMapper = sqlSession2.getMapper(TbSSubtaskResultMapper.class);
        TbSCustMapper tbSCustMapper             = sqlSession2.getMapper(TbSCustMapper.class);
        TbSDepositMapper tbSDepositMapper       = sqlSession2.getMapper(TbSDepositMapper.class);
        TbUBillMapper tbUBillMapper             = sqlSession2.getMapper(TbUBillMapper.class);
        TbLPaybillMapper tbLPaybillMapper       = sqlSession2.getMapper(TbLPaybillMapper.class);
        TbSEmployeeMapper  tbSEmployeeMapper    = sqlSession2.getMapper(TbSEmployeeMapper.class);


        while (true) {

            long startTime = System.currentTimeMillis();//获取当前时间
            List<TbSSubtaskResult> tbSSubtaskResultList = taskResultMapper.selectByState("4");  // 4:boss收到详单

            if (tbSSubtaskResultList.size() == 0) {
                logger.info("------------没有需要处理的数据,休息2s--------");
                Thread.sleep(2000);
                continue;
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");
            // 日期时间转字符串
            LocalDateTime now = LocalDateTime.now();
            String nowYYYYMM = now.format(formatter);

            String custId = null,mapkey=null, employeeId =null, paytype=null, belongId=null;
            int  bill = 0;

            Map<String, List<String>> resultList1 = tbSSubtaskResultList.stream().collect(
                    Collectors.groupingBy(o -> {
                           if (o.getEmployeeId() != null && o.getEmployeeId() !=0)
                               return o.getCustId()+"-"+o.getEmployeeId();
                           else
                               return o.getCustId();
                           },
                            Collectors.mapping(//TbSSubtaskResult::getNid,

                                   // 条数规则： 如果整条短信长度不超70字,算1条,其余按x/67计算,向上取整;
                                    x->{
                                        String num="";
                                        if(x.getMsg().length()<=70)  num="1";
                                         else {

                                            BigDecimal bi1 = new BigDecimal(x.getMsg().length());
                                            BigDecimal bi2 = new BigDecimal(67);
                                            BigDecimal divide = bi1.divide(bi2, 4, RoundingMode.HALF_UP);

                                            num = String.valueOf((int) Math.ceil(divide.doubleValue()));
                                            System.out.println("-----sms num-----"+(int)Math.ceil( divide.doubleValue()));
                                       //     num = String.valueOf((int) Math.ceil((double) (x.getMsg().length() / 67)));
                                        }
                                         return String.valueOf(x.getNid())+"-"+num;
                                       },

                                    Collectors.toList())));

           for (Map.Entry<String, List<String>> entry : resultList1.entrySet()) {

               mapkey = entry.getKey();


               List<String> entryList =entry.getValue();

               List<Integer> batchList= new ArrayList<>();
               List<Integer> numList= new ArrayList<>();


               for(String str : entryList){

                   batchList.add(Integer.valueOf(str.split("-")[0]));
                   numList.add(Integer.valueOf(str.split("-")[1]));

               }

               //批价：如果需要按工号批价，则result表的cust_id,employee_id都需要有值，如果只是按客户批价，则只需要保证cust_id有值即可；
               //billmode表需要按上面批价要求配置cust_id，employee_id字段；
               if (mapkey.split("-").length>1){

                   paytype="2";
                   custId=mapkey.split("-")[0];
                   employeeId=mapkey.split("-")[1];
                   belongId=employeeId;
                   info="工号批价";

               }else {

                   paytype="1";
                   custId=mapkey;
                   employeeId="";
                   belongId=custId;
                   info="客户号批价";
               }

               TbSBillmode  mode= modeMap.get(mapkey);

               if(mode == null){

                   taskResultMapper.updateState("9","mode表未配置"+info+":"+mapkey,batchList);
                   sqlSession2.commit();
                   continue;
               }

                bill  = numList.stream().mapToInt(x ->x).sum() * mode.getBillPrice();  //price 单位:分

                TbUBill tbUBill = new TbUBill();
                tbUBill.setBelongType(paytype);
                tbUBill.setBelongId(belongId);
                tbUBill.setBillDate(Integer.parseInt(nowYYYYMM));
                tbUBill.setBillItem("3"); // '账单项1：语音 2:流量 3:短信',
                tbUBill.setBillAmount(bill); // 单位：分
                tbUBill.setPayAmount(0);
                tbUBill.setOwnAmount(bill);
                tbUBill.setCreateTime(new Date());

                //生成账单
                tbUBillMapper.saveBill(tbUBill);

                int billId =tbUBill.getBillId();

                List<TbSDeposit> tbSDeposits = tbSDepositMapper.selectByBelongId(belongId);

                for (TbSDeposit oneDeposit : tbSDeposits) {

                        TbLPaybill tbLPaybill = new TbLPaybill();
                        tbLPaybill.setBillId(billId);
                        tbLPaybill.setBillDate(tbUBill.getBillDate());
                        tbLPaybill.setBillItem(tbUBill.getBillItem());
                        tbLPaybill.setDepositId(oneDeposit.getDepositId());
                        tbLPaybill.setDeCode(oneDeposit.getDeCode());
                        tbLPaybill.setPayMode("2");  // 1.缴费销账 2.实时销账
                        tbLPaybill.setCreateTime(new Date());

                        if (oneDeposit.getAvailMoney() >= bill) {

                            oneDeposit.setAvailMoney(oneDeposit.getAvailMoney() - bill);
                            tbLPaybill.setPayAmount(bill);
                            tbUBill.setPayAmount(tbUBill.getPayAmount()+bill);

                            bill = 0;

                           } else {

                            tbLPaybill.setPayAmount(oneDeposit.getAvailMoney());
                            tbUBill.setPayAmount(tbUBill.getPayAmount()+oneDeposit.getAvailMoney());
                            bill-=oneDeposit.getAvailMoney();

                            oneDeposit.setAvailMoney(0);

                        }

                        tbLPaybillMapper.insert(tbLPaybill);
                        tbSDepositMapper.updateByPrimaryKey(oneDeposit);

                        tbUBill.setOwnAmount(tbUBill.getBillAmount()-tbUBill.getPayAmount());

                        logger.info("--billid-->"+tbUBill.getBillId()+"--pay-"+tbUBill.getPayAmount()+"---own--"+tbUBill.getOwnAmount());

                        if (bill<=0) break;

                }

               tbUBillMapper.updateByPrimaryKey(tbUBill);
               taskResultMapper.updateState("11",info+"成功,bill_id="+billId,batchList);

               //所有账本销账后，仍然欠费，做停机并生成欠费账单处理
                if (bill > 0) {

                    if ("1".equals(paytype))
                        tbSCustMapper.updateStateById(custId,"2HD");
                    else
                        tbSEmployeeMapper.updateStateById(Integer.valueOf(employeeId),"2HD");

                }

                sqlSession2.commit();

                custId     = null;
                mapkey     =null;
                employeeId =null;
                paytype    =null;
                belongId   =null;
                bill       = 0;

            }

            long endTime = System.currentTimeMillis();
            logger.info("------------本批次处理记录数:"+tbSSubtaskResultList.size()+",分组数:"+resultList1.size()+
                        ",处理时间:"+(endTime-startTime)+"ms");

        }


    } catch (Exception e) {

        if (sqlSession2 != null){
            sqlSession2.rollback();
            sqlSession2.close();
        }

    }finally {

        if (sqlSession2 != null){
            sqlSession2.close();
        }

    }

}

    public static void main(String[] args) {

        SmsBilling.calculate();

    }

}


