package com.zp.msb.c_018_00_AtomicInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-22 18:28
 **/
public class T01_AtomicInteger {
    AtomicInteger count=new AtomicInteger();
    void m(){
        for (int i = 0; i < 10000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        T01_AtomicInteger t=new T01_AtomicInteger();
        List<Thread> threads=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           threads.add( new Thread(t::m,"t-"+i));
        }
        threads.forEach((o)->o.start());

       /* threads.forEach((o)->{
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });*/
        System.out.println(t.count);
    }
}