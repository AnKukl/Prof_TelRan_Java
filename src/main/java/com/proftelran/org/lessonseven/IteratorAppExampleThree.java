package com.proftelran.org.lessonseven;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorAppExampleThree {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Iterator in forward direction");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        System.out.println();
        System.out.println("Iterator in backward direction");
        while (iterator.hasPrevious()) {
            System.out.print(" " + iterator.previous());
        }


        System.out.println();
        ListIterator<String> reverse = list.listIterator(list.size());
    while (reverse.hasPrevious()){
        System.out.print(" " + reverse.previous());
    }

    }
}
