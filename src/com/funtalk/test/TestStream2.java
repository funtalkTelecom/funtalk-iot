package com.funtalk.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class TestStream2 {

    static  int i;

    public static void main(String[] args) {

        // 在stream中，对于结合必须要使用泛型，说明类型
        List<String> delList =new ArrayList();

        delList.add("a");
        delList.add("b");
        delList.add("c");
        delList.add("d");

        Map<String,String>  delCardMap = new HashMap();

        delCardMap.put("a","a++");
        delCardMap.put("b","b++");
        delCardMap.put("c","c++");
        delCardMap.put("d","d++");

        int j=0;

        //  lambda表达式不能修改局部变量的值(方法内定义的基础类型)
        //        可以修改的说明: 静态全局变量,方法内的集合,数组,对象可以修改
        //        集合,数组，对象变量存的是地址，我们修改也不是修改地址，而是修改其指向的对象的属性,所有可以修改，疑问这些对象创建在
        //        堆上,不是在栈中!
        // range(int startInclusive, int endExclusive)
        IntStream.range(0, delList.size())
                .forEach(x-> {
                               setIccidDel(x+1,delList.get(x), delCardMap.get(delList.get(x)));
                               delList.add("abc");
                               delList.remove("a");
                               i=10;
                               // j=1; // 语法不通过，不能修改局部基础变量
                  });


        IntStream.range(0,delList.size()).forEach(
                                x->  System.out.println("------------->"+delList.get(x))
                  );
    }


    public static void setIccidDel(int x,String name, String desc){

        System.out.println("-----"+x+"----"+name+"----"+desc);

    }
}
