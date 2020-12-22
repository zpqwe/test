package com.zp.msb.juc;

/**
 * @program: proxy-demo
 * @description:
 * @author: Long Ao Tian
 * @create: 2020-12-21 21:48
 **/
public class T04_ThreadStatus {
    private static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(this.getState());
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new MyThread();
        System.out.println(t1.getState());

        t1.start();

        t1.join();

        System.out.println(t1.getState());
    }

}

