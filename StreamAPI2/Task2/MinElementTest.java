package com.proftelran.Homework.StreamAPI2.Task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinElementTest {

    public static void main(String[] args) {
        List list = Arrays.asList("a5", "b5", "a2", "b4");
        String str = (String) list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(str);
    }
}
