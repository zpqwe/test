package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-09 09:57
 *
 * 实现 strStr()
 * 给定一个haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 *
 **/
public class Solution12 {
    /*public int strStr(String haystack, String needle) {
        int L=needle.length(),n=haystack.length();

        for (int start = 0; start < n-L-1; ++start) {
            if(haystack.substring(start,start+L).equals(needle)){
                return start;
            }
        }
        return -1;
    }*/

    public int strStr(String haystack,String needle){
        int L=needle.length(),n=haystack.length();
        for (int start = 0; start < n-L-1; start++) {
            if(haystack.substring(start,start+L).equals(needle)){
                return start;
            }
        }
        return -1;
    }
}
