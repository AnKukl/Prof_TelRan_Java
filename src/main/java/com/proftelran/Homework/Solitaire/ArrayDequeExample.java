package com.proftelran.Homework.Solitaire;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        MyDeque deque = new MyArrayDeque();
        Deque deque1 = new ArrayDeque();

        for (int i = 0; i < 10; i++) {
            deque.addToTail(i);
            deque1.addFirst(i);
        }
        System.out.println("a) " + deque + "\n   " + deque1);

        for (int i = 0; i < 12; i++) {
            deque.addToHead(i);
            deque1.addLast(i);
        }
        System.out.println("b) " + deque + "\n   " + deque1);

        for (int i = 0; i < 4; i++) {
            deque.removeTail();
            deque1.removeFirst();
        }
        System.out.println("c) " + deque + "\n   " + deque1);

        for (int i = 0; i < 2; i++) {
            deque.removeHead();
            deque1.removeLast();
        }
        System.out.println("d) " + deque + "\n   " + deque1);

    }
}
