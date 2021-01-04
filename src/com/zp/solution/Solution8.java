package com.zp.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-04 09:18
 *
 * 字符串中第一个唯一字符
 *
 **/
public class Solution8 {
    public int firstUniqChar(String s){
        Map<Character,Integer> frequency =new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(frequency.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s="leetcode";
        Map<Character,Integer> frequency =new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(frequency.get(s.charAt(i))==1){
            }
        }
    }
}
