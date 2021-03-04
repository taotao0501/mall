package com.imooc.AbstractTest;

public class Child extends Father{

    @Override
    public void say() {
        System.out.println("我是子类重写抽象父类中的抽象方法say()");
    }
}
