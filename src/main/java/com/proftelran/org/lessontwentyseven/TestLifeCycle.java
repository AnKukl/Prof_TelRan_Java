package com.proftelran.org.lessontwentyseven;

public class TestLifeCycle {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        System.out.println("Thread created -> 1 - " + thread.getState());
        thread.start();
        System.out.println("Thread started -> 2 - " + thread.getState());
        Thread.sleep(1000);
        System.out.println("Thread sleeps -> 3 - " + thread.getState());
        Thread.sleep(7000);
        System.out.println("Thread ends work -> 4 - " + thread.getState());
    }
}
