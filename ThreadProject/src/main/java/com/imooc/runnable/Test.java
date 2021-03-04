package com.imooc.runnable;

class PrintRunnable implements Runnable {
    int i=0;
    @Override
    public void run() {
        //int i =0;
        while(i<10) {
            System.out.println(Thread.currentThread().getName() + "正在运行！"+ i);
            i++;
        }

    }
}

public class Test {
    public static void main(String[] args) {
        PrintRunnable pr = new PrintRunnable();
        Thread t1 = new Thread(pr);
        t1.start();

        //PrintRunnable pr1 = new PrintRunnable();
        //Thread t2 = new Thread(pr1);
        Thread t2 = new Thread(pr);
        t2.start();
        //多线程运行同一个 Runnable中的run() , 共享 i这个资源，会随机分配cpu时间片给线程t1和t2,总的
        //分配次数是10次，二者在抢
    }
}
