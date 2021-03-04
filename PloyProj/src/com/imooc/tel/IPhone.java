package com.imooc.tel;
/**
 *
 */
public class IPhone implements IPhoto,INet{

    @Override
    public void photo() {
        System.out.println("我是IPhone的拍照功能");
    }

    @Override
    public void network() {
        System.out.println("我是IPhone的上网功能");
    }
}
