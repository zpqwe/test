package com.zp.solution;

/**
 * @program: test
 * @description: 动态规划-买卖股票最佳时机
 * @author: Long Ao Tian
 * @create: 2021-02-12 11:59
 **/
public class Solution29 {
    /**
     * 暴力求解-超出时间限制
     * @param prices
     * @return
     */
    /*public int maxProfit(int [] prices){
        int maxprofit=0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit=prices[j]-prices[i];
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }*/

    /**
     * 动态规划
     * @param prices
     * @return
     */
    public int maxProfit(int [] prices){
       int minprice=Integer.MAX_VALUE;
       int maxprofit=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minprice){
                minprice=prices[i];
            }else if(prices[i]-minprice>maxprofit){
                maxprofit=prices[i]-minprice;
            }
        }
        return maxprofit;
    }

}

