package com.proftelran.org.lessontwentytwo;

import java.util.ArrayList;
import java.util.List;

public class TestGenericTwo {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java");
        list.add(2);
        for (Object str : list) {
            System.out.println((String) str);
        }

        List<String> stringList = new ArrayList();
        stringList.add("Java");

    }
}
