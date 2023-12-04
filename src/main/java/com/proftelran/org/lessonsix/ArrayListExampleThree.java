package com.proftelran.org.lessonsix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExampleThree {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Black");
        stringList.add("Green");
        stringList.add("Pink");
        stringList.add("Red");
        System.out.println(stringList);


       List<String> filterListByWordSize =  filterListByWordSize(stringList, 5);
        System.out.println(filterListByWordSize);

        String collection = collect(stringList);
        System.out.println(collection);

        List<String> collect1 = stringList.stream().filter(s -> s.length() < 5).collect(Collectors.toList());
        System.out.println(collect1);
    }

    private static List<String> filterListByWordSize(List<String> stringList, int wordSize){
        List<String> newList = new ArrayList<>();
        for (String value : stringList){
            if (value.length() < wordSize){
                newList.add(value);
            }
        }
        return newList;
    }

    private static String collect(List<String> stringList) {
        String result = null;
        for (int i = 0; i < stringList.size(); i++) {
            result = result + " " + stringList.get(i);
        }
        return result;

}
}
