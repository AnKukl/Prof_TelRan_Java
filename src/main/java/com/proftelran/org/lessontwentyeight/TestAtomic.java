package com.proftelran.org.lessontwentyeight;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {

    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.getAndIncrement();
                    System.out.println("Counter = " + counter.get());
                }
            }
        };

        long startTime = System.currentTimeMillis();
        Thread threadOne = new Thread(runnable);
        Thread threadTwo = new Thread(runnable);
        Thread threadThree = new Thread(runnable);

        System.out.println();


        threadOne.start();
        threadTwo.start();
        threadThree.start();

        threadOne.join();
        threadTwo.join();
        threadThree.join();

        System.out.println("Counter = " + counter);
        System.out.println("Execute time = " + (System.currentTimeMillis() - startTime));


    }
}
