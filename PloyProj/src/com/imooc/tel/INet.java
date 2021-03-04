package com.imooc.tel;

//接口访问修饰符：public 默认
public interface INet {
    //接口中抽象方法可以不写abstract
    //访问修饰符默认为public
    //当类实现接口时，需要去实现接口中的所有抽象方法，否则需要将该类设置为抽象类
    void network();
    int TEMP=23;

    //default:默认方法，可以带方法体，jdk1.8新增
    //可以在实现类中重写，并可以通过接口的引用调用
    default void connection() {
        System.out.println("我是接口中的默认方法");
    }

    //static:静态方法 可以带方法体 jdk1.8新增
    //不可以在实现类中重写，可以用接口名调用
    static void stop() {
        System.out.println("我是接口中的静态链接");
    }

}
