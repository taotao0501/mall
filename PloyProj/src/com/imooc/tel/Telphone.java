package com.imooc.tel;

/**
 * 原始手机
 * @author sheben
 */

public class Telphone {
    private String brand;
    private int price;

    public Telphone(){};

    public void call(){
        System.out.println("手机能够打电话");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
