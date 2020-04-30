package com.funtalk.test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {

        Map<Integer,Integer> failBatchIds = new HashMap();

        Map<String,Object> paramMap = new HashMap();

        paramMap.put("abc","1");
        paramMap.put("abc","2");

        System.out.println(paramMap.get("abc"));

        Integer  failNum=0;

        failBatchIds.put(new Integer(1001),new Integer(1001));

        failNum = failBatchIds.containsKey(new Integer(1001)) ?
                failBatchIds.get(new Integer(1001))+1 : 1;

        failBatchIds.put(new Integer(1001),failNum);

        System.out.println(failBatchIds.get(1001));

    }
}
