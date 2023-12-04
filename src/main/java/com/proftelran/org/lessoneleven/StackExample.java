package com.proftelran.org.lessoneleven;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //LIFO
        // push - add element to Stack
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        System.out.println(stack);

        //search - return index of element from stack;
        System.out.println("Index of One = " + stack.search("One"));
        System.out.println("Index of Four = " + stack.search("Four"));

        //peek - get element from top without remove;
        System.out.println("Top element " + stack.peek());

        System.out.println(stack);

        //pop - get and remove element from stack
        System.out.println("Top element " + stack.pop());
        System.out.println(stack);

        //isEmpty
        while(!stack.isEmpty()){
            String element = stack.pop();
            System.out.println("Element from stack : " + element);
        }
        print();
        System.out.println();
    }

    public static void print(){
        //
    }
}
