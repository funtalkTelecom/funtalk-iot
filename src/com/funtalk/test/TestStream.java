package com.funtalk.test;

import java.util.*;
import java.util.stream.Collectors;

public class TestStream {

    static class  User{
        String name;
        String location;
        int age;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }



       User(String name,String location,int age){

           this.name=name;
           this.location=location;
           this.age=age;
       }

        @Override
        public String toString() {
            return "User{ name='" + name  +  "', location='" + location + "'," + "',age='"+age+"'}";
        }

    }


    /*    ---| Itreable      接口 实现该接口可以使用增强for循环
                ---| Collection        描述所有集合共性的接口
                    ---| List接口        可以有重复元素的集合
                            ---| ArrayList
                            ---| LinkedList
                    ---| Set接口        不可以有重复元素的集合
                            ---| HashSet  线程不安全，存取速度快。底层是以哈希表实现的。
 */


    public static void main(String[] args) {

        User user1 = new User("zhangsan", "beijing", 10);
        User user2 = new User("zhangsan", "beijing", 20);
        User user3 = new User("lisi", "shanghai", 30);
        User user4 = new User("lisi", "shanghai", 31);
        User user5 = new User("wangwu", "shanghai", 21);


        List<User> simpleServList = new ArrayList<User>();
        simpleServList.add(user2);
        simpleServList.add(user1);
        simpleServList.add(user3);
        simpleServList.add(user4);
        simpleServList.add(user5);


        Map  testMap = new HashMap();

        testMap.put("1","ok");
        testMap.put("2","false");

        if (testMap.size()>0) {
            System.out.println("------------->" + testMap.get("3"));
            return;

        }

        //            //  .collect(Collectors.joining(","));
        //-->[lisi=2, zhangsan=2]
        Set objs=
                simpleServList.stream().collect(
                        Collectors.groupingBy(x->x.name,Collectors.counting())
                           ).entrySet().stream().filter( x->x.getValue()>1).collect(Collectors.toSet());

        Iterator it = objs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // {lisi=2, zhangsan=2}
        Map<String,Long> objmap=
                simpleServList.stream().collect(
                        Collectors.groupingBy(x->x.name,Collectors.counting())
                ).entrySet().stream().filter( x->x.getValue()>1).collect(Collectors.toMap(x ->x.getKey(),x-> x.getValue()));

        System.out.println("-------------->"+objmap.toString());


        // List<User>  disUserList= simpleServList.stream().distinct().collect(Collectors.toList());

        // 下面写法要求simpleServList 中key不能重复，否则程序抛duplicate key 异常
        // Map simpleMap= simpleServList.stream().collect(Collectors.toMap(x->x.name,x->x.age));

        Map<String,Integer>  accnbrIotMap=  new HashMap<String,Integer>();

/*        List<User> unique = simpleServList.stream().collect(
                                      Collectors.collectingAndThen(
                                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getName))),
                                                                  ArrayList::new));*/

       //  collectingAndThen
       // 双字段去重 Comparator.comparing(o -> o.getName() + ";" + o.getSex())
        List<User> unique = simpleServList.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getName))),
                        ArrayList::new));

        System.out.println("-------------->"+unique.toString());

    }




}
