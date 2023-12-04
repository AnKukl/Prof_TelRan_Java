package com.proftelran.org.lessonsix;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleTwo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Black");
        stringList.add("Green");
        stringList.add("Pink");
        stringList.add("Red");
        System.out.println(stringList);

        List<String> stringToLowerCase = toLowerCase(stringList);
        System.out.println("new list" + stringToLowerCase);


        toLowerCaseInplace(stringList);
        System.out.println("Original list" + stringList);
    }


    private static List<String> toLowerCase(List<String> stringList){
        ArrayList<String> newList = new ArrayList<>();
        for (String value : stringList) {
            String newString = value.toLowerCase();
            newList.add(newString);
        }
        return newList;
    }

    private static void toLowerCaseInplace(List<String> stringList){
        for (int i = 0; i < stringList.size(); i++) {
            String value = stringList.get(i);
            String newString = value.toLowerCase();
            stringList.set(i, newString);

        }

    }


}
