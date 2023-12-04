package com.proftelran.org.lessonnine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TsetExampleFour {
    public static void main(String[] args) {
        List<String> str = List.of("One", "Two", "One", "Three", "Four","Three");
        List<String> duplicateList = getDuplicateList(str);
        System.out.println("Duplicate objects :" + duplicateList);
    }

    private static List<String> getDuplicateList(List<String> stringList) {
        Set<String> uniqueSet = new HashSet<>();
        List<String> duplicateList = new ArrayList<>();
        for (String value : stringList) {
            if(!uniqueSet.add(value)) {
                duplicateList.add(value);
            }
        }

        return duplicateList;
    }
}
