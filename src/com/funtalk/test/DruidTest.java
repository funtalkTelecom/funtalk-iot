package com.funtalk.test;

import com.funtalk.mapper.TbSBillmodeMapper;
import com.funtalk.pojo.TbSBillmode;
import com.funtalk.util.MBSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DruidTest {

    SqlSession sqlSession1=null;
    SqlSession sqlSession2=null;
    String info;


    public  void search(){

        Map<String, TbSBillmode> modeMap= new HashMap<>();

            int i=0;


                try {

                    while (i<10) {

                        sqlSession1 = MBSessionFactory.getSession();

                        TbSBillmodeMapper tbSBillmodeMapper = sqlSession1.getMapper(TbSBillmodeMapper.class);

                        List<TbSBillmode> tbSBillmodeList = tbSBillmodeMapper.selectAll();

                        modeMap = tbSBillmodeList.stream().collect(Collectors.toMap(
                                v -> {
                                    if (v.getEmployeeId() != null && v.getEmployeeId() != 0)
                                        return v.getCustId() + "-" + v.getEmployeeId();
                                    else
                                        return v.getCustId();
                                }, v -> v));

                        sqlSession1.close();

                        Thread.sleep(10000);
                        System.out.println("--------------------"+(++i));

                    }

            } catch (Exception e) {

                if (sqlSession1 != null)
                    sqlSession1.close();
                e.printStackTrace();

            }





      }




    public static void main(String[] args) {

        new  DruidTest().search();

    }



}
