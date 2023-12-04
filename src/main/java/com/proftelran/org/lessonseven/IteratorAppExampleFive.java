package com.proftelran.org.lessonseven;

import java.util.ArrayList;
import java.util.List;

public class IteratorAppExampleFive {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        //1
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            System.out.print(" " + integer);
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("Time for execute is " + (end - start));

        long startTwo = System.currentTimeMillis();
        for (Integer element : list) {
            System.out.print(" " + element);
        }
        System.out.println();
        long endTwo = System.currentTimeMillis();
        System.out.println("Time for execute is " + (endTwo - startTwo));
    }
}
