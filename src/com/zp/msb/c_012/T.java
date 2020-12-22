package com.zp.msb.c_012;

import java.util.concurrent.TimeUnit;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-22 15:25
 **/
public class T {
    /*volatile*/ boolean running=true;
    public void m(){
        while (running){
//            try {
//                TimeUnit.SECONDS.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        T t=new T();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                t.m();
//            }
//        },"t1").start();
//
//        new Thread(()->{
//            t.m();
//        },"t1").start();
        //
        new Thread(t::m,"t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running=false;
    }
}
