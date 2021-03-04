package com.imooc.tel;

//类实现这个接口
public class Camera implements IPhoto{
    public void video(){
        System.out.println("相机还能拍照");
    }
    @Override
    public void photo() {
        System.out.println("相机可以拍照");
    }
}
