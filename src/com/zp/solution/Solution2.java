package com.zp.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-16 09:11
 * 两个数组的交集
 **/
public class Solution2 {
    // 方法1 使用哈希表
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        // 首先遍历第一个数组，并在哈希表中记录第一个数组中的每个数字以及对应出现的次数
        for (int num:nums1
             ) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num,count);
        }
        int[] intersection=new int[nums1.length];
        int index=0;
        // 然后遍历第二个数组，对于第二个数组中的每个数字，如果在哈希表中存在这个数字，则将该数字添加到答案，并减少哈希表中该数字出现的次数
        for (int num:nums2
             ) {
            Integer count = map.getOrDefault(num, 0);
            if(count>0){
                // 将数字添加到答案
                intersection[index++]=num;
                // 减少哈希表中出现的次数
                count--;
                // 如果count中大于0说明还存在，就继续添加进哈希表，否则就删除掉这个元素
                if(count>0){
                    map.put(num,count);
                }else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection,0,index);
    }

    // 首先对两个数组进行排序，然后使用两个指针遍历两个数组。
    public int[] intersect2(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1=nums1.length,length2=nums2.length;
        int[] intersection=new int[Math.min(length1,length2)];
        int index1=0,index2=0,index=0;
        while (index1<length1&&index2<length2){
            if(nums1[index1]<nums2[index2]){
                index1++;
            }else if(nums1[index1]>nums2[index2]){
                index2++;
            }else {
                intersection[index]=nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(intersection,0,index);
    }

}
