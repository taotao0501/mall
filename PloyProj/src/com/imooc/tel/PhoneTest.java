package com.imooc.tel;



public class PhoneTest {
    public static void main(String[] args) {
        FourthPhone phone=new FourthPhone();
        phone.call();
        phone.message();
        phone.video();
        phone.music();
        phone.photo();
        phone.network();
        phone.game();
        System.out.println("================");
        //接口引用指向类的实现方式，但是这里只能调用接口的方法
        IPhoto ip=new FourthPhone();
        if (ip instanceof IPhoto) {
            System.out.println("ip是实现了IPoto接口的类的对象");
        }
        ip.photo();
        ip=new Camera();
        ip.photo();
        System.out.println("================");
        System.out.println(INet.TEMP);
        INet net=new SmartWatch();
        INet.stop();//接口名调用
        System.out.println(net.TEMP);

    }
}
