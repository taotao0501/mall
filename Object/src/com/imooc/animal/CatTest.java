package com.imooc.animal;

import com.imooc.mechanical.*;

/**
 * 实例化宠物猫类，创建一个对象
 */
public class CatTest {
    public static void main(String[] args){
        //对象实例化(申明和创建)
        Cat one = new Cat("花花",12,2000,"中华田园猫");
        Mechanical jack = new Mechanical();
        //如果未被赋值，则默认值数值为0，字符型和布尔型为null
        one.run();
    }

}
