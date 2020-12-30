package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-29 09:22
 *
 * 反转字符串
 **/
public class Solution6 {
    public void reverseString(char[] s){
        int n=s.length;
        for (int left = 0,right=n-1; left <right ;++left,--right) {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
        }
    }
}
