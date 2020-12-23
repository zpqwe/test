package com.zp.msb.c_020;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-23 17:57
 *
 * reentrantlock 用于替代synchronized
 * 由于m1锁定this,只有m1执行完毕的时候，m2才能执行
 * 这里是复习synchronized最原始的语言义
 *
 * 使用reentrantlock可以完成同样的功能
 * 需要注意的是，必须要手动释放锁(很重要)
 * 使员工sync锁定的话如果遇到异常，jvm会自动释放锁，但是lock必须手动释放锁，因此经常在finally中进行锁的释放
 *
 * 使用reentrantLock可以进行 尝试锁定 tryLock 这样无法锁定，或者在指定时间内无法锁定，线程可以决定是否继续
 * 使用ReentrantLock还可以调用lockInterruptibly方法，可以对线程interrupt方法做出相应，在一个线程等待锁的过程中，可以被打断
 * ReentrantLock还可以指定为公平锁
 **/
public class T04_ReentrantLock4 {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();

//        Thread t1=new Thread(()->{
//
//        }).start();
    }
}
