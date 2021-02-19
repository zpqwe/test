package com.zp.solution;

import java.util.Stack;

/**
 * @program: mydemo
 * @description: 设计问题-最小栈
 * @author: Mr.zeng
 * @create: 2021-02-19 09:49
 **/
public class MinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        dataStack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if(minStack.isEmpty()||x<=minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {
        Integer x = dataStack.pop();
        if(x.equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
