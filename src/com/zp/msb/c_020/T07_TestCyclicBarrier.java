package com.zp.msb.c_020;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class T07_TestCyclicBarrier {
   static CyclicBarrier barrier=new CyclicBarrier(20,()->{
        System.out.println("满人");
    });

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
