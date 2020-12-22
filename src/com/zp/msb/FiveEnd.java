package com.zp.msb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-18 09:18
 **/
public class FiveEnd {
    List lists= Collections.synchronizedList(new ArrayList<>());
    public void add(Object o){
        lists.add(o);
    }
    public int size(){
        return lists.size();
    }

    Thread t1=new Thread(()->{
        for (int i = 0; i < 10; i++) {
            lists.add(new Object());
            System.out.println("add "+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    },"t1");

    Thread t2=new Thread(()->{
        while (true){
            if(lists.size()==5){
                System.out.println(Thread.currentThread().getName()+"结束");
                break;
            }
        }
    },"t2");

    public static void main(String[] args) {
        FiveEnd fiveEnd=new FiveEnd();
        fiveEnd.t1.start();
        fiveEnd.t2.start();

    }
}
