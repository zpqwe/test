package com.zp;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-12 16:54
 *  两个线程分别交替打印
 **/
public class AlternatePrint {
    public static void main(String[] args) {
        char[] c1 = "1234567".toCharArray();
        char[] c2 = "abcdefg".toCharArray();
        Object lock=new Object();
        new Thread(()->{
            synchronized(lock){
                for (char c:c1){
                    System.out.print(c);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }

        },"t1").start();

        new Thread(()->{
            synchronized (lock){
                for (char c:c2){
                    System.out.print(c);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        },"t2").start();
    }
}
