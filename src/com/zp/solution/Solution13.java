package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-13 09:47
 *
 * 外观数列
 **/
public class Solution13 {
    public String countAndSay(int n) {
        //递归终止条件
        if(n==1){
            return "1";
        }
        //递归内容
        StringBuffer ans=new StringBuffer();
        int i=0;
        String res = countAndSay(n - 1);
        int len = res.length();
        while (i<len){
            int count =1;
            while (i<len-1&&res.charAt(i)==res.charAt(i+1)){
                count++;
                i++;
            }
            ans.append(count).append(res.charAt(i));
            i++;
        }
        return ans.toString();
    }
}
