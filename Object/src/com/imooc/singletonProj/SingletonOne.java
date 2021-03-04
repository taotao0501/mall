package com.imooc.singletonProj;

/**
 * 饿汉式：创建对象实例的时候直接初始化
 */
public class SingletonOne {
    //1.私有构造方法
    private SingletonOne(){}

    //2.该类型私有静态实例
    private static SingletonOne instance =new SingletonOne();

    //3.静态共有方法用于创建、获取静态私有对象
    public static SingletonOne getInstance(){
        return instance;
    }
}
