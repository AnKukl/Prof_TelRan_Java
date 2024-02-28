package com.proftelran.org.lessonthirty.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Person implements Runnable {

    private String name;
    private CyclicBarrier cyclicBarrier;

    public Person(String name, CyclicBarrier cyclicBarrier) {
        this.name = name;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("-> " + name + " ожидает на платформе");
        try {
            cyclicBarrier.await();

            System.out.println("<- " + name + " на вершине горы");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
