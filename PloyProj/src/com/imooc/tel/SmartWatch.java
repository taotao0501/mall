package com.imooc.tel;

public class SmartWatch implements INet{
    public void call() {
        System.out.println("智能手表可以打电话");
    }
    public void message() {
        System.out.println("智能手表可以发短信");
    }
    public void network() {
        System.out.println("智能手表可以上网");
    }

    //defalut方法可以重写
    @Override
    public void connection() {
        INet.super.connection();//调用接口中的默认方法
    }
}
