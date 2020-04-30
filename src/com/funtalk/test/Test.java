package com.funtalk.test;

import com.sun.deploy.util.StringUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {


    public static  void writeLog(){


        // while()循环中:
        // 报异常后，while循环的变量值i不再继续累加
        // try catch 后面的代码在报异常后，会继续执行；  try中的异常后面的代码在报异常后永远不会执行
        // try catch 要写在循环内

        int i=9;

/*        while (i<20){

        try {
            Thread.sleep(2000);
            System.out.println("------i-------"+i);
            if (i==10)
                throw new Exception("xyz");
            i++;  //i++ 在异常后面，在i==10抛出异常后，此代码就不会再执行，i就一直=10, 程序就不断循环抛出异常，下面的break也不会执行；

        }catch (Exception e){
           e.printStackTrace();
        }
            System.out.println("------i-------"+i+"----------");

        if (i==11)
            break;
        }*/

        // for()循环中:
        // 报异常后，for循环的变量值j会继续累加
        // try catch 后面的代码在报异常后，会继续执行；  try中的异常后面的代码在报异常后永远不会执行
        // try catch 要写在循环内
        for (int j=9; j<20; j++){

            try {
                Thread.sleep(2000);
                if (j==11)
                    throw new Exception("xyz");

                System.out.println("------j-------"+j);

                for (int m=9; m<10; m++){

                    System.out.println("-------inter m----------");
                }

            }catch (Exception e){
                e.printStackTrace();
            }


            System.out.println("------jj-------"+j+"----------");

            if (j==11)
                break;
        }

    }

    public static void main(String[] args) throws Exception {

/*        DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        String  orderNo = sdf.format(new Date().getTime())+(int)((Math.random()*9+1)*100000);

        //2020 0426 105555 232354
        System.out.println("------->"+orderNo+"---------->"+Math.random());*/

        writeLog();


     /*   while (true) {
            System.out.println("--------------------test---------------");

            Thread.sleep(1000);
        }*/


/*     try{
         throw new Exception("run error...........");

     }finally {

         System.out.println("------final-------");
     }*/

/*
     String abc="abc-def";

        System.out.println("----------"+abc.split("-").length+"------"+abc.split("-")[0]);


        List alist= new ArrayList();
        alist.add("shanghai");


        System.out.println( "----------"+StringUtils.join(alist,";"));
*/

  /*      List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

        List<User> list = new ArrayList<>();
        //User 实体 测试用 String id,name;
        //当前测试以id来分组，具体请按开发场景修改
        list.add(new User("1", "zhang1",20));
        list.add(new User("1", "zhang2",20));
        list.add(new User("2", "li4",30));
        list.add(new User("2", "li4",30));
        list.add(new User("2", "wang5",40));
        list.add(new User("3", "wang1",31));


        Map<String, List<User>> resultList1 = list.stream().collect(Collectors.groupingBy(User::getId));

        for (Map.Entry<String, List<User>> entry : resultList1.entrySet()) {

            System.out.println("---key--->"+entry.getKey()+"---size---"+entry.getValue().get(0).getName());
        }

        // 分组统计
        Map<String, List<User>> countMap = list.stream().collect(Collectors.groupingBy(o -> o.getId() + "_" + o.getAge()));
        for (Map.Entry<String, List<User>> entry : countMap.entrySet()) {

            System.out.println("---key--->"+entry.getKey()+"---size---"+entry.getValue().get(0).getName());
        }

        List<String> countRecords = countMap.keySet().stream().map(key -> {
            String[] temp = key.split("_");
            String id = temp[0];
            int age = Integer.parseInt(temp[1]);
            return id;
        }).collect(Collectors.toList());

        System.out.println("---countRecords--->"+countRecords);*/

    }
}
