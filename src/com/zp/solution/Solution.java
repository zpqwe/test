package com.zp.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-15 09:08
 * 存在重复元素 分别使用数组与哈希表  containsDuplicate
 **/
public class Solution {
    // 使用数组从大到小排序，如果存在重复元素一定出现在相邻位置
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        for (int i = 0; i < n-1; i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }


    /**
     * 对于数组中每个元素，插入到哈希表中，如果插入元素时发现该元素已经存在于哈希表中，则说明存在重复元素
     * @param nums
     * @return
     */
    public boolean containsDuplicate2(int[] nums){
        Set<Integer> set=new HashSet<>();
        for (int x:nums
             ) {
            if(!set.add(x)){
                return true;
            }
        }
        return false;
    }
}
