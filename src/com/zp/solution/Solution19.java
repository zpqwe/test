package com.zp.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-26 09:30
 *
 * 回文链表
 **/
public class Solution19 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals=new ArrayList<>();
        //将链表的值复制到数组中
        ListNode currentNode=head;
        while (currentNode!=null){
            vals.add(currentNode.val);
            currentNode=currentNode.next;
        }
        //使用双指针判断是否回文
        int front=0;
        int back=vals.size()-1;
        while (front<back){
            if(!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
   public class ListNode {
   int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
