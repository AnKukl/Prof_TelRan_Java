package com.proftelran.Homework.BookShelf;

import java.util.Arrays;
import java.util.Comparator;

public class NameSort_2Task {
    public static void main(String[] args) {
        String[][] data = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}};

        Arrays.sort(data, Comparator.comparing((String[] arr) -> arr[0]).thenComparing(arr -> arr[1]));

        for (String[] pair : data) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
