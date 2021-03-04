package com.imooc.tel;

/**
 * Ipad实现了IPhoto和INet接口
 */

public class Ipad implements IPhoto,INet{
    @Override
    public void network() {
        System.out.println("Ipad可以上网");
    }

    @Override
    public void photo() {
        System.out.println("Ipad可以拍照");
    }

    //可以重写，并不必须
    @Override
    public void connection() {
        System.out.println("我是INet接口实现类中重写其默认方法的方法");
    }
}
