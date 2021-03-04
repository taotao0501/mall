package com.imooc.singletonProj;

import com.imooc.singletonProj.SingletonOne;
import com.imooc.singletonProj.SingletonTwo;

public class Test {
    public static void main(String[] args) {
        //饿汉式
//        SingletonOne one = SingletonOne.getInstance();
//        SingletonOne two = SingletonOne.getInstance();
//        System.out.println(one);
//        System.out.println(two);
        //内存中的同一个对象

        //懒汉式
        SingletonTwo one1 = SingletonTwo.getInstance();
        SingletonTwo two1 = SingletonTwo.getInstance();
        System.out.println(one1);
        System.out.println(two1);
    }
}
