package com.zp.msb;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-17 08:54
 **/
public class T01_WithVolatile {
    List list=new ArrayList<>();
    public void add(Object o){list.add(o);}
    public int size(){return list.size();}

    public static void main(String[] args) {
        T01_WithVolatile c=new T01_WithVolatile();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                c.add(new Object());
                System.out.println("add"+i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                }
            }
        },"t1").start();
        new Thread(()->{
            while (true){
                if(c.size()==5){
                    break;
                }
            }
            System.out.println("t2 结束");
        },"t2").start();
    }
}
