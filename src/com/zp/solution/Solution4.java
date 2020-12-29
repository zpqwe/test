package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-23 09:39
 * 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Solution4 {
    //
    /**/
    public int[] twoSum(int[] nums,int target){
        int len=nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j <len ; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
       int[] nums =new int[]{2, 7,11,15};
        int[] ints = new Solution4().twoSum(nums, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(nums[ints[i]]);
        }
    }
}
