package com.proftelran.Homework.userRequestStorageSystem.MethodTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MethodTest {

    public static void main(String[] args) {
        String str = "private public static";
        countOfSymbolsInARow(new HashMap<>(), str);
    }

    public static void countOfSymbolsInARow(Map map, String string) {
        Map<Character, Integer> newMap = map;
        char[] symbols = string.toCharArray();
        int value;
        for (char sym : symbols) {
            if (newMap.containsKey(sym)) {
                value = newMap.get(sym);
                newMap.put(sym, value + 1);
            } else newMap.put(sym, 1);
        }
        System.out.printf("%-10s %-10s\n", "Key", "Value");
        newMap.forEach((key,val) -> {
            System.out.printf("%-10s %-10s\n", key, val);

        });
    }
}
