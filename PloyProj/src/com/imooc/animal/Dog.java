package com.imooc.animal;

public class Dog extends Animal {
    //属性：性别
    private String sex;

    public Dog() {}

    public Dog(String name,int month,String sex) {
        super(name ,month);
        this.sex =sex ;
    }

    //方法：睡觉
    public void sleep() {
        System.out.println("小狗有午睡的习惯");
    }

    //方法：吃东西（重写父方法）
    @Override
    public void eat() {
        System.out.println("狗吃肉~~~！");
    }
}