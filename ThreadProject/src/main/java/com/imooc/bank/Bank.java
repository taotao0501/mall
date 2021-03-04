package com.imooc.bank;

public class Bank {
    private String account;
    private int balance; //余额
    public Bank(String account,int balance) {
        this.account=account;
        this.balance=balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank[账号："+ account +",余额：" + balance +"]";
    }

    //存款
    public synchronized void saveAccount() {
        //获取当前的账号余额
        int balance=getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance+=100;
        setBalance(balance);
        System.out.println("存款后的账号余额为：" + balance);
    }

    //取款
    public void drawAccount() {
        synchronized (this) {
            int balance = getBalance();

            balance = balance - 200;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(balance);
            System.out.println("取200元后账号余额为：" + balance);
        }
    }
}
