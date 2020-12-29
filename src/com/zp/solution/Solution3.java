package com.zp.solution;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-17 10:59
 *  加一
 **/
public class Solution3 {
    public int[] plusOne(int[] digits){
        for (int i = digits.length-1; i >0 ; i--) {
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0)return digits;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits=new int[]{1,2,9};
        int[] ints = new Solution3().plusOne(digits);
        for(int d:ints){
            System.out.println(d);
        }
    }
}
