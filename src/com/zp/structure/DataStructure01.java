package com.zp.structure;

/**
 * 数据结构01
 */
public class DataStructure01 {
    int fact1(int n){
        int i,j,temp,s;
        s=0;
        for(i=0;i<=n;i++){
            temp=1;
            for(j=1;j<=i;j++){
                temp=temp*j;
                s+=temp;
            }
        }
        return s;
    }
    int fact2(int n){
        int i,j,temp,s;
        s=0;temp=1;
        for(i=1;i<=n;i++){
            temp=temp*i;
            s+=temp;
        }
        return s;
    }
}
