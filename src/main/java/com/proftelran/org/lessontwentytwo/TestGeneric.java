package com.proftelran.org.lessontwentytwo;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("I like ");
        String text = (String) list.get(0) ;
        System.out.println(text);
    }
}
