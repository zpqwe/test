package com.zp.solution;

/**
 * @program: mydemo
 * @description: 第一个错误的版本
 * @author: Mr.zeng
 * @create: 2021-02-05 09:34
 **/
public class Solution27 {
    boolean isBadVersion(int version){
        return true;
    }

    /**
     * 二分查找 第一个错误的版本
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //因为要返回的是true, 当仍然诶true的时候向下遍历不要mid-1, 不然答案就被删除了
            //为真则向下遍历
            if (isBadVersion(mid)) {
                right = mid;
            } else {  //为false则向上遍历
                left = mid + 1;
            }
        }
        return left;  //经过不知道几次循环之后, 达到条件left=right, 或者left>right是退出循环
    }


}
