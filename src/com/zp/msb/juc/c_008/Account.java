package com.zp.msb.juc.c_008;

/**
 * @program: proxy-demo
 * @description:
 * @author: Long Ao Tian
 * @create: 2020-12-21 23:05
 **/
public class Account {
    private String name;
    private double balance;

    public synchronized void setBalance(String name,double balance){
        this.name=name;
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance=100;
    }
    public /*synchronized*/ double getBalance()  {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.balance;
    }

    public static void main(String[] args) {
        new Thread(()->{
                Account a = new Account();
                System.out.println( a.getBalance());
                a.setBalance("1",100);
                System.out.println(a.getBalance());
        },"t1").start();
    }


}

