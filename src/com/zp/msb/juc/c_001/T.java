package com.zp.msb.juc.c_001;

/**
 * @program: proxy-demo
 * @description:
 * @author: Long Ao Tian
 * @create: 2020-12-21 22:00
 **/
public class T {

    private static int count=10;
    private Object o=new Object();
    public void  m(){
        synchronized (o){
            count--;
            System.out.println(Thread.currentThread().getName()+"count"+count);
        }
    }

    public static void main(String[] args) {
        new Thread(()->{
            while (count!=0){
                new T().m();
            }
        },"t1").start();
    }
}

