package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-15 09:30
 * 只出现过一次的数字
 **/
public class Solution1 {
    public int singleNumber(int[] nums){
        int single=0;
        for (int num:nums
             ) {
            single^=num;
        }
        return single;
    }
}
