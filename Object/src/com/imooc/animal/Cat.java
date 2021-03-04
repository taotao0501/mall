package com.imooc.animal;

/**
 * 以宠物猫为例子说明创建类的过程
 * @author  sbt
 */
public class Cat extends Animal {
    public static int st3=44;

    static {
        System.out.println("我是子类静态代码块");
    }

    {
        System.out.println("我是子类构造代码块");
    }
    public Cat(){
        System.out.println("我是子类的无参构造方法");
    }
    public Cat(String name){
        System.out.println(name + "我是重载了的有参构造方法");
    }

    public Cat(String name,int month,double weight,String species){
        //this();
        this("jack");
        this.name=name;
        this.month=month;
        this.weight=weight;
        this.species=species;
    }

    public void run(){
        this.eat();
//        super.eat();

    }

    public void eat(){
        System.out.println("小猫吃鱼");
    }
}
