package com.funtalk.test;

import java.util.ArrayList;
import java.util.List;

public class generic<T> {

    static  class Fruit{}
    static  class Apple extends Fruit{}
    static  class Apple1 extends Apple{}
    static  class Orange extends Fruit{}



        public static void main(String[] args) {
            List<? super Apple> list = new ArrayList<>();
            list.add(new Apple());
            list.add(new Apple1());
            //list.add(new Fruit());

            Object apple = list.get(0);
        }


}
