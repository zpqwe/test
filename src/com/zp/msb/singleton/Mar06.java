package com.zp.msb.singleton;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-22 16:17
 **/
public class Mar06 {
    private static /*volatile */Mar06 MAR06=null;
    private Mar06(){}

    public Mar06 getInstance(){
        // 双重检查
        if(MAR06==null){
            synchronized (Mar06.class){
                if(null==MAR06){
                    MAR06=new Mar06();
                }
            }
        }
        return MAR06;
    }
}
