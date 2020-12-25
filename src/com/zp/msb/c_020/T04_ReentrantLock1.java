package com.zp.msb.c_020;

import java.util.concurrent.TimeUnit;

public class T04_ReentrantLock1 {
     void m1(){
         synchronized(this){
             try {
                 for (int i = 0; i < 10; i++) {
                     TimeUnit.SECONDS.sleep(1);
                     System.out.println(i);
                     if(i==2)m2();
                 }
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

    }
     void m2(){
         synchronized(this){
             System.out.println("m2");
         }
    }

    public static void main(String[] args) {
        T04_ReentrantLock1 t=new T04_ReentrantLock1();
        new Thread(t::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
