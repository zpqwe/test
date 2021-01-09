package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-08 11:30
 *
 * 字符串转换整数
 **/
public class Solution11 {
    public int strToInt(String str){
        //得到一个char数组
        char[] c = str.trim().toCharArray();
        // 如果c的长度为0就直接返回
        if(c.length==0)return 0;
        // res=0,bndry=Integer 最大值/10
        int res=0,bndry=Integer.MAX_VALUE/10;
        int i=1,sign=1;
        if(c[0]=='-')sign=-1;
        else if(c[0]!='+')i=0;
        for (int j = i; j < c.length; j++) {
            if(c[j]<'0'||c[j]>'9')break;
            if(res>bndry||res==bndry&&c[j]>'7')return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res=res*10+(c[j]-'0');
        }
        return sign*res;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE/10);
    }
}
