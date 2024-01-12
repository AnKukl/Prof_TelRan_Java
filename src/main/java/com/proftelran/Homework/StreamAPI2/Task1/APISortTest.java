package com.proftelran.Homework.StreamAPI2.Task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class APISortTest {

    public static void main(String[] args) {
        List list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List sorted = list.stream().distinct()
                .sorted()
                .toList();
        List reserved = sorted.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted);
        System.out.println(reserved);
    }
}
