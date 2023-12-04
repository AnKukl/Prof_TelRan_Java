package com.proftelran.Homework.HW_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListExample_HW {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillTheList(list);
//        #1
        System.out.println(list);
        System.out.println(printX2List(list));
        System.out.println();
//        #2
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hell");
        stringList.add("Hel");
        stringList.add("Hel");
        stringList.add("H");
        stringList.add("");
        System.out.println(list);
        System.out.println(gatValueLengthList(stringList));
        System.out.println();
//      #3
        List<Integer> integerList = new ArrayList<>();
        fillTheList(integerList);
        System.out.println(integerList);
        System.out.println(getOddNumbersList(integerList));
        System.out.println();
//      #4
        System.out.println(getListWithoutDuplicates(stringList));
        System.out.println();
    }

    private static List<Integer> printX2List(List<Integer> doubleNumber) {
        List<Integer> expectedList = new ArrayList<>();
        for (int i = 0; i < doubleNumber.size(); i++) {
            expectedList.add(i, doubleNumber.get(i) * 2);
        }
        return expectedList;
    }

    private static List<Integer> getOddNumbersList(List<Integer> list) {
        List<Integer> expectedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                expectedList.add(list.get(i));
            }
        }
        return expectedList;
    }

    private static List<Integer> gatValueLengthList(List<String> list) {
        List<Integer> expectedList = new ArrayList<>();
        for (String str : list) {
            expectedList.add(str.length());
        }
        return expectedList;
    }

    private static List<String> getListWithoutDuplicates(List<String> list) {
        List<String> expectedList = new ArrayList<>();

            for (String str : list) {
                if (!expectedList.contains(str)){
                    expectedList.add(str);
                }
            }
        return expectedList;
    }

    private static List<Integer> fillTheList(List<Integer> emptyList) {
        for (int i = 0; i < 10; i++) {
            emptyList.add(i);
        }
        return emptyList;
    }
}
