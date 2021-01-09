package com.zp.msb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-09 15:25
 **/
public class T07_SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            final int j=i;
            service.execute(()->{
                System.out.println(j+" "+Thread.currentThread().getName());
            });
        }
    }
}
