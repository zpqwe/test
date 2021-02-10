package com.zp.solution;

/**
 * @program: test
 * @description: 动态规划- 爬楼梯
 * @author: Mr.zeng
 * @create: 2021-02-10 22:46
 **/

public class Solution28 {
    public int climbStairs(int n){
        int p=0,q=0,r=1;
        for (int i = 1; i <n ; ++i) {
            p=q;
            q=r;
            r=q+p;
        }
        return r;
    }

}
