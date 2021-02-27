package com.zp.solution;

/**
 * @program: test
 * @description:颠倒二进制位
 * @author: Long Ao Tian
 * @create: 2021-02-27 15:15
 **/
public class Solution38 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        for (int i = 0; i < 32; i++) {
            result <<=1;
            result +=1&n;
            n >>=1;
        }
        return result;
    }

}

