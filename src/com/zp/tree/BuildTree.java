package com.zp.tree;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-21 15:32
 **/
public class BuildTree {

    /**
     * 两层循环实现构建树
     * @param treeNodes 传入的树节点列表
     * @return
     */
    public static List<TreeNode> build(List<TreeNode> treeNodes){
        List<TreeNode> trees=new ArrayList<>();
        for (TreeNode treeNode:treeNodes
             ) {
            if(0==treeNode.getParentId()){
                trees.add(treeNode);
            }
            for (TreeNode it:treeNodes){
                if(it.getParentId()==treeNode.getId()){
                    treeNode.getChildren().add(it);
                }
            }
        }
        return trees;
    }
    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(1,0,"广州",1);
        TreeNode treeNode2=new TreeNode(2,0,"深圳",2);

        TreeNode treeNode3=new TreeNode(3,1,"天河区",1);
        TreeNode treeNode4=new TreeNode(4,1,"越秀区",2);
        TreeNode treeNode5=new TreeNode(5,1,"黄浦区",3);

        TreeNode treeNode6=new TreeNode(6,3,"石牌",1);

        TreeNode treeNode7=new TreeNode(7,6,"百脑汇",2);


        TreeNode treeNode8=new TreeNode(8,2,"南山区",1);
        TreeNode treeNode9=new TreeNode(9,2,"宝安区",2);
        TreeNode treeNode10=new TreeNode(10,8,"科技园",1);

        TreeNode treeNode11=new TreeNode(11,10,"宿舍a",1);
        TreeNode treeNode12=new TreeNode(12,10,"宿舍b",2);

        List<TreeNode> list=new ArrayList<>();
        list.add(treeNode1);
        list.add(treeNode2);
        list.add(treeNode3);
        list.add(treeNode4);
        list.add(treeNode5);
        list.add(treeNode6);
        list.add(treeNode7);
        list.add(treeNode8);
        list.add(treeNode9);
        list.add(treeNode10);
        list.add(treeNode11);
        list.add(treeNode12);

        List<TreeNode> trees=BuildTree.build(list);
        System.out.println(JSON.toJSON(trees));
    }
}
