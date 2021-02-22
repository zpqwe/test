package com.zp.solution;

import java.util.Arrays;

/**
 * @program: mydemo
 * @description: 力扣-数学-计数质数
 * @author: Mr.zeng
 * @create: 2021-02-22 09:47
 **/
public class Solution33 {

    public int countPrimes(int n){
        int[] isPrime=new int[n];
        Arrays.fill(isPrime,1);
        int ans=0;
        for (int i = 2; i < n; ++i) {
            if(isPrime[i]==1){
                ans+=1;
                if((long)i*i<n){
                    for (int j = i*i; j < n; j+=i) {
                        isPrime[j]=0;
                    }
                }
            }
        }
        return ans;
    }
}
