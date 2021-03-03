package com.zp.solution;

import java.util.Arrays;

/**
 * @program: mydemo
 * @description: 缺失数字
 * @author: Mr.zeng
 * @create: 2021-03-03 09:49
 **/
public class Solution41 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        // 判断n 是否出现在末位
        if(nums[nums.length-1]!=nums.length){
            return nums.length;
        }
        // 判断0是否出现在末尾
        else if(nums[0]!=0){
            return 0;
        }
        // 此时缺失的数字一定在(0,n)中
        for (int i = 1; i < nums.length; i++) {
            int expectedNum=nums[i-1]+1;
            if(nums[i]!=expectedNum){
                return expectedNum;
            }
        }
        // 未缺失数字，(保证函数有返回值)
        return -1;
    }
}
