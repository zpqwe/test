package com.zp.msb.c_020;

import java.util.concurrent.CountDownLatch;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-25 09:10
 * 讲解CountDownLatch   (countDown 方法)(await 方法)
 *
 * CountDown倒数   Latch门栓
 **/
public class T06_TestCountDownLatch {
    private static void usingCountDownLatch(){
        Thread[] threads=new Thread[100];
        CountDownLatch latch=new CountDownLatch(threads.length);

        for (int i = 0; i < threads.length; i++) {
            threads[i]=new Thread(()->{
                int result=0;
                for (int j = 0; j < 10000; j++) {
                    result+=j;
                }
                latch.countDown();
            });
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        try{
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end latch");
    }
    private static void usingJoin(){
        Thread[] threads=new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i]=new Thread(()->{
                int result=0;
                for (int j = 0; j < 10000; j++) {
                    result+=j;
                }
            });
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end join");
    }
}
