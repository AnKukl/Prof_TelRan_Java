package com.proftelran.org.lessonthirty.semaphore;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class TestSemaphore {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5, true);
        //true - occupied, false - free

        boolean[] freeTables = new boolean[5];

        String[] personNames = {"Alex", "Alexandro", "Zuzia", "Katrine", "Sebastian", "Maxim", "Fred"};

        Arrays.stream(personNames).map(name -> new Person(name, semaphore, freeTables))
                .map(person -> new Thread(person)).forEach(thread -> {
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    thread.start();
                });
    }
}
