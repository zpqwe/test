package com.zp.solution;

import java.util.Arrays;

/**
 * @program: mydemo
 * @description: 合并两个有序数组
 * @author: Mr.zeng
 * @create: 2021-02-04 09:04
 **/
public class Solution26 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
