package com.zp.msb.c_020;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-23 17:59
 **/
public class T04_ReentrantLock3 {
    Lock lock=new ReentrantLock();
    void m1(){

            try {
                lock.lock();
                for (int i = 0; i < 10; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
    }

    /**
     * 使用trylock进行尝试锁定，不管锁定与否，方法都将继续执行
     * 可以根据trylock的返回值来判断是否锁定
     * 也可以指定trylock的时间，由于trylock(time)抛出异常，所以要注意unlock
     */
    void m2(){
        boolean locked=false;
        try{
            locked= lock.tryLock(5, TimeUnit.SECONDS);
            System.out.println("m2"+locked);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (locked)lock.unlock();
        }
    }

    public static void main(String[] args) {
        T04_ReentrantLock3 t=new T04_ReentrantLock3();
        new Thread(t::m1).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(t::m2).start();
    }
}
