package com.proftelran.org.lessontwentyeight;

public class SyncImpl implements Runnable {

    @Override
    public void run() {

        synchronized (this) {
            System.out.println("I am " + Thread.currentThread().getName() + " captured monitor");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am " + Thread.currentThread().getName() + " released monitor");

        }
    }
}
