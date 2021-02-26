package com.zp.solution;

/**
 * @program: mydemo
 * @description: 汉明距离
 * @author: Mr.zeng
 * @create: 2021-02-26 09:50
 **/
public class Solution37 {
        public int hammingDistance(int x, int y) {
            return Integer.bitCount(x ^ y);
        }
}
