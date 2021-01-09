package com.zp.msb;

import java.util.concurrent.*;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-09 15:40
 **/
public class T14_MyRejectedHandler {
    public static void main(String[] args) {
        ExecutorService service=new ThreadPoolExecutor(4,4,
                0, TimeUnit.SECONDS,new ArrayBlockingQueue<>(6),
                Executors.defaultThreadFactory(),
                new Myhandler()
                );
    }
    static class Myhandler implements RejectedExecutionHandler{

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            //log("r rejected")
            //save r kafka mysql redis
            // try 3 time
            if(executor.getQueue().size()<1000){
                //try put again();
            }
        }
    }
}
