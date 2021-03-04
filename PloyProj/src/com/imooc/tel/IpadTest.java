package com.imooc.tel;
/**
 * 测试类
 */
public class IpadTest {
    public static void main(String[] args) {
        Ipad ipad1 = new Ipad();
        ipad1.network();
        ipad1.photo();
        System.out.println("=============");

        INet ipad2 = new Ipad();
        ipad2.network();
        ipad2 = new IPhone();
        ipad2.network();

        System.out.println("=============");
        IPhoto iphoto = new IPhone();
        iphoto.photo();
        iphoto = new Ipad();
        iphoto.photo();
    }
}
