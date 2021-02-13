package com.zp.solution;

/**
 * @program: test
 * @description: 打家劫舍
 * @author: Long Ao Tian
 * @create: 2021-02-13 12:32
 **/
public class Solution30 {
    /**
     * 时间复杂度 O（n）
     * 空间复杂度 O（n）
     * @param nums
     * @return
     */
    public int rob(int[] nums){
        if(nums.length==0||nums==null){
            return 0;
        }
        int length=nums.length;
        if(length==1){
            return nums[0];
        }
        int[] dp=new int[length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);

        }
        return dp[length-1];
    }

    /**
     * 时间复杂度O（n）
     * 空间复杂度O（1）
     * @param nums
     * @param s
     * @return
     */
    public int rob(int[] nums,int s){
        if(nums.length==0||nums==null){
            return 0;
        }
        int length=nums.length;
        if(length==1){
            return nums[0];
        }
        int first=nums[0],second=Math.max(nums[0],nums[1]);
        for (int i = 2; i < length; i++) {
            int temp=second;
            second=Math.max(first+nums[i],second);
            first=temp;

        }
        return second;
    }

}

