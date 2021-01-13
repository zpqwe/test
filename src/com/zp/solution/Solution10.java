package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-07 09:17
 *
 * 验证回文串
 **/
public class Solution10 {
    public boolean isPalindrome(String s){
        StringBuffer sgood=new StringBuffer();
        int length=s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sgood.append(Character.toLowerCase(c));
            }
        }
        StringBuffer sgood_rev=new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }

}
