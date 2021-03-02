package com.zp.solution;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @program: mydemo
 * @description: 有效的括号
 * @author: Mr.zeng
 * @create: 2021-03-02 09:49
 **/
public class Solution40 {
    public boolean isValid(String s){
        int n=s.length();
        if(n%2==1){
            return false;
        }
        Map<Character,Character> pairs=new HashMap<Character, Character>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(pairs.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() !=pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
