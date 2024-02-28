package com.proftelran.homework.hyppodrome;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Hippodrome {

    final static int LOOP_LENGTH = 100;

    public static void main(String[] args) {

        Random random = new Random();
        List<Horse> horseList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            horseList.add(new Horse("Horse " + i, random.nextInt(10)));
        }

        horseList.stream()
                .map(Thread::new)
                .toList()
                .forEach(Thread::start);


    }
}
