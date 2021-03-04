package com.imooc.animal;

public class Cat extends Animal{
    //属性：体重
    private double weight;

    public Cat() {}

    public Cat(String name,int month,double weight) {
        super(name,month);
        this.weight=weight;
    }

    //方法：跑动
    public void run() {
        System.out.println("小猫快跑");
    }

    //方法：吃东西（重写父类方法）
    @Override
    public void eat() {
        System.out.println("猫吃鱼~~~！");
    }

    // 这里要注意 这里的 say() 是 Cat类独有的静态的方法，与Animal父类的say()不构成重写关系，
    // 因此不能加 @Override注解符
    public static void say() {
        System.out.println("小猫碰胡须");
    }

//    public void playBall() {
//        System.out.println("小猫玩线球");
//    }
}
