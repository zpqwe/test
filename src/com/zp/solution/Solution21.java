package com.zp.solution;

/**
 * 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn08xg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
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
  public boolean isValidBST(TreeNode root){
        return helper(root,null,null);
  }
  public boolean helper(TreeNode node,Integer lower,Integer upper){
        if(node==null){
            return true;
        }
        int val=node.val;
        if(lower!=null&&val<=lower){
            return false;
        }
        if(upper!=null&&val>=upper){
            return false;
        }
        if(!helper(node.right,val,upper)){
            return false;
        }
        if(!helper(node.left,lower,val)){
            return false;
        }
        return true;
  }

}
