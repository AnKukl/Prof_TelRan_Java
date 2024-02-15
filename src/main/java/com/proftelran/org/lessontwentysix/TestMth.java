package com.proftelran.org.lessontwentysix;

public class TestMth {

    public static void main(String[] args) {
        System.out.println("Thread from main method = " + Thread.currentThread().getName());

        CustomThread customThread = new CustomThread();
        customThread.start();

        CustomThread customThread2 = new CustomThread();
        customThread2.start();

        CustomThread customThread3 = new CustomThread();
        customThread3.start();

    }
}
