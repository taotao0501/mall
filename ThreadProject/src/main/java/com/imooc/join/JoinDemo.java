package com.imooc.join;

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            System.out.println(getName() + "正在执行！");
        }
    }



}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程运行结束");
    }
}
