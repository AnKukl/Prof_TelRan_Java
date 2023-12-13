package com.proftelran.Homework.StreamApiTest.Task2;

import java.util.Arrays;

public class StringSorting {

    public static void main(String[] args) {
        String[] strings = {"Antidote", "Lag", "Separate", "Consequence"};
        Arrays.stream(strings).sorted().forEach(System.out::println);
    }
}
