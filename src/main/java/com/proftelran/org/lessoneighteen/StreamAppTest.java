package com.proftelran.org.lessoneighteen;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAppTest {
    public static void main(String[] args) {
        String[][] array = {{"Hello"," World"},
                {"Hello"," Java"},
                {"Hello", "Student"},
                {"Welcome", "to", "Tel-Ran"}};
        //1.count words
        //2.count unique words
        System.out.println(Stream.of(array).flatMap(x -> Arrays.stream(x)).count());
        System.out.println(Stream.of(array).flatMap(x -> Arrays.stream(x)).distinct().count());


    }
}
