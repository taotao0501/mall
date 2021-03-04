package com.imooc.animal;

public class Master {
    /**
     * 喂宠物
     * 喂猫猫：吃完东西后，主人会带着去玩线球
     * 喂狗狗：吃完东西后，主人会带着狗狗去睡觉
     * 养兔子、鹦鹉、乌龟
     */

    public void feed(Animal obj) {
        if(obj instanceof Cat) {
            Cat temp=(Cat) obj;
            temp.eat();

        } else if(obj instanceof Dog) {
            Dog temp2=(Dog) obj;
            temp2.eat();
            temp2.sleep();
        }

    }

    /**
     * 饲养何种动物
     * 空闲时间多：养狗
     * 空闲时间少：养猫
     */

    public Animal raise(boolean isManyTime) {
        if(isManyTime) {
            System.out.println("主人时间多，适合养狗");
            return new Dog();
        }else{
            System.out.println("主人时间少，适合养猫");
            return new Cat();
        }
    }
}
