package com.imooc.tel;

public class Computer implements INet{
//    public void network() {
//        System.out.println("电脑可以上网");
//    }
    public void game() {
        System.out.println("电脑可以玩游戏");
    }

    public void video() {
        System.out.println("电脑可以看视频");
    }

    public void music() {
        System.out.println("电脑可以听音乐");
    }

    @Override
    public void network() {

    }

    @Override
    public void connection() {

    }


}
