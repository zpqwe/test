package com.zp.solution;

/**
 * @program: mydemo
 * @description: 位1的个数
 * @author: Mr.zeng
 * @create: 2021-02-25 09:44
 **/
public class Solution36 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bits=0;
        int mask=1;
        for (int i = 0; i < 32; i++) {
            if((n&mask)!=0){
                bits++;
            }
            mask<<=1;
        }
        return bits;
    }
}
