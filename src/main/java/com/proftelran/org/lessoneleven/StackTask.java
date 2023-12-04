package com.proftelran.org.lessoneleven;

import java.util.Stack;

public class StackTask {

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b','a','c','a'};

        //Collections.shuffle();
        //ca
        //abbaca
        //aaca
        //ca

    Stack<Character> stack = new Stack<>();
    for (char element : chars){
        if (!stack.isEmpty() && stack.peek() == element){
            stack.pop();
            continue;
        }
        stack.push(element);
    }

        System.out.println(stack);
    }
}
