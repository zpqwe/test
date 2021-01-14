package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-14 11:10
 *
 * 最长公共前缀
 **/
public class Solution14 {
    /**
     *
     * @param strs 字符串数组
     * @return
     */
    public String longestCommonPrefix(String[] strs){
        if(strs==null||strs.length==0){
            return "";
        }
        //得到第一个元素
        String prefix=strs[0];
        //得到元素的长度
        int count = strs.length;
        for (int i = 0; i < count; i++) {
            prefix=longestCommonPrefix(prefix,strs[i]);
            if(prefix.length()==0){
                break;
            }
        }
        return prefix;
    }
    public String longestCommonPrefix(String str1,String str2){
        //将两个字符串长度进行对比，得到最小长度
        int length = Math.min(str1.length(), str2.length());
        int index=0;
        // index 小于 length && str1的第一个元素等于str2的第二个元素
        while (index<length&&str1.charAt(index)==str2.charAt(index)){
            index++;
        }
        //将从0开始到index元素相同的字符返回出去
        return str1.substring(0,index);
    }
}
