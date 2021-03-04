package com.imooc.people;

public class PersonTest {
    public static void main(String[] args) {
        Person lili=new Person();
        lili.age=12;

        //获取内部类对象实例：
        //Person.Heart myHeart= new Person().new Heart();
//        System.out.println(myHeart.beat());
//        //实例对象
//        //myHeart = lili.new Heart();
//        System.out.println(myHeart.beat());
//        //外部类一般要写一个方法便于内部类的实例化
//        myHeart = lili.getHeart();
//        System.out.println(myHeart.beat());

        //获取静态内部类对象实例，并不依赖于
//        Person.Heart myHeart2=new Person.Heart();
//        System.out.println(myHeart2.beat());
//
//        Person.Heart.say();

        //获取方法内部
        people_Method_inClass marry=new people_Method_inClass();
        marry.age = 23;
        System.out.println(marry.getHeart());

    }
}
