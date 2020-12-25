package com.zp.msb.c_020;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
// 演示ReentrantLock 的公平锁
public class T04_ReentrantLock5 extends Thread{
    //参数为true表示公平锁
    public static final Lock lock=new ReentrantLock(true);
    public void run(){
            for (int i = 0; i < 100; i++) {
               try{
                   lock.lock();
                System.out.println(Thread.currentThread().getName()+"i");
            }finally {
            lock.unlock();
        }
            }

        }

    public static void main(String[] args) {
        T04_ReentrantLock5 t=new T04_ReentrantLock5();
        Thread t2=new Thread(t);
        Thread t1=new Thread(t);
        t2.start();
        t1.start();
    }
}
