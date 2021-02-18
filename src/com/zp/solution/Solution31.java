package com.zp.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: mydemo
 * @description: 设计问题-打乱数组
 * @author: Mr.zeng
 * @create: 2021-02-18 10:44
 **/
public class Solution31 {
    private int[] array;
    private int[] original;
    private Random rand=new Random();

    private List<Integer> getArrayCopy(){
        List<Integer> asList=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            asList.add(array[i]);
        }
        return asList;
    }
    public Solution31(int[] nums) {
        array=nums;
        original=nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array=original;
        original=original.clone();
        return array;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> aux=getArrayCopy();
        for (int i = 0; i < array.length; i++) {
            int removeIdx=rand.nextInt(aux.size());
            array[i]=aux.get(removeIdx);
            aux.remove(removeIdx);
        }
        return array;
    }
}
