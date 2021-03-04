package com.imooc.inheritance;

import com.imooc.animal.Animal;

public class ObjectTest {
    public static void main(String[] args) {
        Animal one=new Animal("花",2,2000,"野猫");
        Animal two=new Animal("花",2,2000,"野猫");

        //1.判断对象:判断两个对象是不是指向同一个内存空间，
        boolean flag=one.equals(two);
        System.out.println(flag);
        System.out.println((one==two));
        //2.判断字符串:判断是内容是否一致
        String a="abc";
        String b="abc";
        flag = a.equals(b);
        System.out.println((flag));

        /**toString的调试
         * 1.输出对象名时，默认调用Object。toString,输出在内存中的数值=类型@地址
         */
        System.out.println(one);
        System.out.println(one.toString());

    }
}
