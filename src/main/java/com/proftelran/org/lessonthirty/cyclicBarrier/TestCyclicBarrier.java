package com.proftelran.org.lessonthirty.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {

    public static void main(String[] args) throws InterruptedException {

        String[] personNames = {"Alex", "Alexandro", "Zuzia", "Katrine", "Sebastian", "Maxim", "Fred", "Sindy"};

        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Funicular());

        for (String personName : personNames) {
            new Thread(new Person(personName, cyclicBarrier)).start();
            Thread.sleep(400);
        }

    }
}
