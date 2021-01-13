package com.zp.solution;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-06 09:26
 *
 * 有效的字母异位词
 **/
public class Solution9 {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] charst = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charst);
        return Arrays.equals(chars,charst);
    }
}
