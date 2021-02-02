package com.zp.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: mydemo
 * @description: 二叉树的层序遍历
 * @author: Mr.zeng
 * @create: 2021-02-02 10:41
 **/
public class Solution24 {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> ret=new ArrayList<>();
      if(root==null){
          return ret;
      }
      Queue<TreeNode> queue=new LinkedList<>();
          queue.offer(root);
          while (!queue.isEmpty()){
              List<Integer> level=new ArrayList<>();
              int currentLevelSize=queue.size();
              for (int i = 1; i <=currentLevelSize ; ++i) {
                  TreeNode node = queue.poll();
                  level.add(node.val);
                  if(node.left!=null){
                      queue.offer(node.left);
                  }
                  if(node.right!=null){
                      queue.offer(node.right);
                  }
              }
              ret.add(level);
          }
          return ret;
    }
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }

        return ret;
    }

}
