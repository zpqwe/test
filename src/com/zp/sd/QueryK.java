package com.zp.sd;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-07 15:31
 *
 * 设计算法在整形数组A【n】职工你查找值为k的元素，若找到，则输出其位置i(0<=i<=n-1) 否则输出-1作为标志，并分析算法的时间复杂度
 **/
public class QueryK {
    public int selectK(int[] a,int k){
        int len=a.length;
        for (int i = 0; i <len ; i++) {
            if(i==k){
                return i;
            }
        }
        return -1;
    }


    int search(int A[],int n,int k){
        int i=0;
        // i<=n-1
        while(i<=n-1){
            if(A[i]!=k)i++;
            else break;
            //i<n-1 返回i
            if(i<n-1)return i;
            else return -1;
        }
        return 0;
    }
}
