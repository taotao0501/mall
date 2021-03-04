package com.imooc.queue;

public class Queue {
    private int n;
    boolean flag=false;
    public synchronized int get() {
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("消费："+ n);
        flag=false;//消费完毕，容器已空
        notifyAll();
        return n;
    }

    public synchronized void set(int n) {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产：" + n);
        this.n=n;
        flag=true;//生产完成，容易已满
        notifyAll();
    }
}
