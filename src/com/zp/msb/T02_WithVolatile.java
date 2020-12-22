package com.zp.msb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-17 08:54
 *
 * t1 运行，list.size ==5 t2结束
 **/
public class T02_WithVolatile {
//    volatile List list=new ArrayList<>();
    // volatile 尽量修饰简单的值，尽量不要修饰 引用值，
     List list= Collections.synchronizedList(new ArrayList<>());
    public void add(Object o){list.add(o);}
    public int size(){return list.size();}

    public static void main(String[] args) {
        T02_WithVolatile c=new T02_WithVolatile();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                c.add(new Object());
                System.out.println("add"+i);
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                }
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
