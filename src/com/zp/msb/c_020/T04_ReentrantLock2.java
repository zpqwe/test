package com.zp.msb.c_020;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T04_ReentrantLock2 {
    Lock lock=new ReentrantLock();
     void m1(){
       lock.lock(); /* synchronized(this){*/
             try {
                 for (int i = 0; i < 10; i++) {
                     TimeUnit.SECONDS.sleep(1);
                     System.out.println(i);
                     if(i==2)m2();
                 }
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }finally {
                 lock.unlock();
             }
         //}

    }
     void m2(){
         try{
             lock.lock();/*synchronized(this){*/
             System.out.println("m2");
         }finally {
             lock.unlock();
         }
    }

    public static void main(String[] args) {
        T04_ReentrantLock2 t=new T04_ReentrantLock2();
        new Thread(t::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
