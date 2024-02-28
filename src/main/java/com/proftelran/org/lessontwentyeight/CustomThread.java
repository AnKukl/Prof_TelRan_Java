package com.proftelran.org.lessontwentyeight;

public class CustomThread extends Thread {
    private Object monitor;

    public CustomThread(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            System.out.println("I am " + Thread.currentThread().getName() + " captured monitor ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am " + Thread.currentThread().getName() + " released monitor ");

        }
    }
}
