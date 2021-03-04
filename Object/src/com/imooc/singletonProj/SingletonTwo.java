package com.imooc.singletonProj;

/**
 * 懒汉式：不直接创建静态实例，而是在使用的时候使用静态getter方法完成初始化
 */
public class SingletonTwo {
    //1.私有构造方法
    private SingletonTwo(){}
    //2.该类型私有静态实例
    private static SingletonTwo instance=null;

    //3.创建开放的静态方法提供实例对象
    public static SingletonTwo getInstance(){
        if(instance==null)
            instance=new SingletonTwo();
        return instance;
    }
}
