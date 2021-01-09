package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-29 09:09
 *
 * 旋转图像
 **/
public class Solution5 {
    public void rotate(int[][] matrix){
        int n=matrix.length;
        int[][] matrix_new=new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix_new[j][n-i-1]=matrix[i][j];
            }
        }
        for (int i = 0; i < n;++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j]=matrix_new[i][j];
            }
        }
    }
}