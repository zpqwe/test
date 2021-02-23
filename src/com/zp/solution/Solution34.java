package com.zp.solution;

/**
 * @program: mydemo
 * @description: 判断一个数是不是3的幂
 * @author: Mr.zeng
 * @create: 2021-02-23 09:45
 **/
public class Solution34 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
