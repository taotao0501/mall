package com.imooc.animal;

public class Animal {
    protected String name="妮妮";
    protected  int month=2;
    double weight;
    String species="动物";
    public int temp=15;

    static {
        System.out.println("我是父类静态代码块");
    }
    private static int st1=22;
    private static int st2=23;

    public Animal() {
        System.out.println("我是父类无参构造方法");
    }

    public Animal(String name,int month,int weight,String species) {
        this.setName(name);
        this.month=month;
        this.weight=weight;
        this.species=species;
    }

    {
        System.out.println("我是父类构造代码块");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static void run(){
//        this.eat();
        System.out.println("Animal 快跑");
    }

    public void eat(){
        System.out.println("Animal 吃鱼");
    }
}
