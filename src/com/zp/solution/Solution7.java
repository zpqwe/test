package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-30 09:08
 *
 *反转整数
 **/
public class Solution7 {
   /* public int reverse(int x) {
        int ans=0;
        while (x!=0){
            if((ans*10)/10!=ans){
                ans=0;
                break;
            }
            ans=ans*10+x%10;
            x=x/10;
        }
        return ans;
    }*/
    public int reverse(int x){
        if(x!=0){
            String s = String.valueOf(x);
            StringBuffer sb=new StringBuffer(s);
            return Integer.valueOf(sb.reverse().toString());
        }
        return 0;
    }
}
