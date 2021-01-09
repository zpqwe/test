package com.zp.tree;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2020-12-21 15:41
 **/

public class TreeNode {
    private int id;
    private int parentId;
    private String name;
    private int sortId;
    private Set<TreeNode> children=new LinkedHashSet<>();

    public TreeNode(int id, int parentId, String name, int sortId) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.sortId = sortId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public Set<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Set<TreeNode> children) {
        this.children = children;
    }
}
