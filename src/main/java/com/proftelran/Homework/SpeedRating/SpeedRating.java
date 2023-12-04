package com.proftelran.Homework.SpeedRating;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SpeedRating {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillTheList(list);
        System.out.println("Оценка скорости алгоритмов перебора списков:\n");
        checkTheList1(list);
        checkTheList2(list);
        checkTheList3(list);
        checkTheList4(list);
        checkTheList5(list);
        checkTheList6(list);


    }

    private static List<Integer> fillTheList(List<Integer> list) {
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        return list;
    }

    private static void checkTheList1(List<Integer> list) {
        System.out.println("Time for-each loop:");
        long a = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);

    }
    private static void checkTheList2(List<Integer> list) {
        System.out.println("classic for и вызываем list.size() для каждой итерации");
        long a = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = i;
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);

    }

    private static void checkTheList3(List<Integer> list) {
        System.out.println("classic for, но list.size() определяем в переменную");
        long a = System.currentTimeMillis();
        long c = list.size();
        for (int i = 0; i < c; i++) {
            int temp = i;
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    private static void checkTheList4(List<Integer> list) {
        System.out.println("classic for, list.size() определяем в переменную, перебираем с конца (i--)");
        long a = System.currentTimeMillis();
        long c = list.size();
        for (long i = c; i > 0; i--) {
            long temp = i;
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    private static void checkTheList5(List<Integer> list) {
        System.out.println("используя Iterator");

        long a = System.currentTimeMillis();
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            integerIterator.next();
        }

        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    private static void checkTheList6(List<Integer> list) {
        System.out.println("используя ListIterator");

        long a = System.currentTimeMillis();
        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()){
            integerListIterator.next();
        }

        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }
}
