package com.imooc.animal;

// abstract 设置抽象类后，不能实例化，但是可以向上转型，指向子类实例
public class Animal {

    private String name;
    private int month;

    public Animal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Animal(String name, int month) {
        this.setName(name);
        this.setMonth(month);
    }




    // 吃东西的方法
    public void eat() {
        System.out.println("动物都有吃东西的能力");
    }

    public static void say() {
        System.out.println("小动物之间打招呼");
    }
}

