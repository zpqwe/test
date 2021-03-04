package com.zp.datastructure;

import com.zp.msb.c_012.T;

import java.util.*;

/**
 * @program: mydemo
 * @description: this is a class
 * @author: Mr.zeng
 * @create: 2021-03-04 10:44
 **/
public class DataStructure1 {
    public static void array() {
        // 初始化一个长度为5的数组 array
        int[] array=new int[5];
        //元素赋值
        array[0]=2;
        array[1]=2;
        array[2]=2;
        array[3]=2;
        array[4]=2;
    }
    public static void arrayLen(){
        // 初始化可变数组
        List<Integer> array=new ArrayList<>();
        //向尾部添加元素
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
    }
    // 链表
    public  void linkedList(){
        //实例化节点
        ListNode n1=new ListNode(4);
        ListNode n2=new ListNode(5);
        ListNode n3=new ListNode(1);

        //构建引用指向
        n1.next=n2;
        n2.next=n3;
    }
    class ListNode{
        int val;    //节点值
        ListNode next;//后继节点引用
        ListNode(int x){val=x;}
    }

    public void stack(){
        Stack<Integer> stack=new Stack<>();
        stack.push(1);//元素1 入栈
        stack.push(2);//元素2 入栈
        stack.pop(); //出栈--->元素2
        stack.pop();//出栈---->元素1

        //TODO 注意：通常情况下，不推荐使用Java的Vector以及其子类Stack，而一般将LinkedList作为栈来使用。

    }
    public void stackflag(){
        LinkedList<Integer> stack=new LinkedList<>();

        stack.addLast(1); //元素1 入栈
        stack.addLast(2); //元素2 入栈
        stack.removeLast(); //出栈 -->元素2
        stack.removeLast();// 出栈--->元素1
    }


    public void queue(){
        // 队列是一种具有【先入先出】特点的抽象数据结构，可用链表实现
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);//元素1入队
        queue.offer(2);//元素2入队
        queue.poll();//出队-->元素1
        queue.poll();//出队-->元素2
    }

    class TreeNode{
        int val;    //节点值
        TreeNode left;//左子节点
        TreeNode right;//右子节点
        TreeNode(int x){val=x;}
    }
    public void treeNode(){
        //初始化节点
        TreeNode n1=new TreeNode(3); //根节点root
        TreeNode n2=new TreeNode(4);
        TreeNode n3=new TreeNode(5);
        TreeNode n4=new TreeNode(1);
        TreeNode n5=new TreeNode(2);

        //构建引用指向
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
    }
    // 表示图的方法通常有两种
    public void figure(){
        //领接矩阵
        int[] vertices={1,2,3,4,5};
        int[][]edges={{0,1,1,1,1},
                {1,0,0,1,0},
                {1,0,0,0,1},
                {1,1,0,0,1},
                {1,0,1,1,0}};
    }
    public void figure2(){
        //邻接表
        int[] vertices={1,2,3,4,5};
        List<List<Integer>>edges=new ArrayList<>();

        List<Integer> edge_1=new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> edge_2=new ArrayList<>(Arrays.asList(0,3));
        List<Integer> edge_3=new ArrayList<>(Arrays.asList(0,4));
        List<Integer> edge_4=new ArrayList<>(Arrays.asList(0,1,4));
        List<Integer> edge_5=new ArrayList<>(Arrays.asList(0,2,3));
        edges.add(edge_1);
        edges.add(edge_2);
        edges.add(edge_3);
        edges.add(edge_4);
        edges.add(edge_5);
    }
    //邻接矩阵 VS 邻接表：
    //邻接矩阵的大小只与节点数量有关，即N^ ，其中N为节点数量。因此，当边数量明显少于节点数量时，使用邻接矩阵存储图会造成较大的内存浪费


    public void hashTable(){
        //初始化散列表
        Map<String,Integer> dic=new HashMap<>();

        //添加key->value 键值对
        dic.put("小力",10001);
        dic.put("小特",10002);
        dic.put("小扣",10003);

        //从姓名查找学号
        dic.get("小力");//->10001
        dic.get("小特");//->10002
        dic.get("小扣");//->10003
    }

    public void simpleHash(){
        String[] names={"小力","小特","小扣"};

        System.out.println(names[hash(10001)]);
        System.out.println(names[hash(10002)]);
        System.out.println(names[hash(10003)]);
    }
    int hash(int id){
        int index=(id-1)%10000;
        return index;
    }

    public void heap(){
        //初始化小顶堆
        Queue<Integer> heap=new PriorityQueue<>();

        //元素入堆
        heap.add(1);
        heap.add(4);
        heap.add(2);
        heap.add(6);
        heap.add(8);

        //元素出堆(从小到大)
        heap.poll();//->1
        heap.poll();//->2
        heap.poll();//->4
        heap.poll();//->6
        heap.poll();//->8
    }

    public static void main(String[] args) {
        new DataStructure1().simpleHash();;
    }
}
