package com.zp.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-28 09:21
 *
 * 环形链表- 如果链表中存在环，则返回 true 。 否则，返回 false
 **/
public class Solution20 {
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
         val = x;
        next = null;
     }
 }
    public boolean hasCycle(ListNode head) {
     Set<ListNode> seen=new HashSet<>();
     while (head!=null){
         if(!seen.add(head)){
             return true;
         }
         head=head.next;
     }
     return false;
    }
}
