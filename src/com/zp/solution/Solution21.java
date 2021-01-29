package com.zp.solution;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-29 09:19
 *
 * 二叉树的最大深度
 **/
public class Solution21 {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  // 递归解法
    public int maxDepth(TreeNode root) {
         if(root==null){
             return 0;
         }else {
             int leftHeight=maxDepth(root.left);
             int rightHeight=maxDepth(root.right);
             return Math.max(leftHeight,rightHeight)+1;
         }
    }
}
