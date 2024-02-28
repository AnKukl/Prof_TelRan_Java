package com.proftelran.org.lessonthirty.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        String[] personNames = {"Alex", "Alexandro", "Zuzia", "Katrine", "Sebastian", "Maxim", "Fred", "Sindy"};

        for (String name : personNames) {
            new Thread(new PersonInAirport(name, countDownLatch)).start();
            Thread.sleep(700);
        }

    }
}
