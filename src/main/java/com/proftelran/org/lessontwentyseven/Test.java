package com.proftelran.org.lessontwentyseven;

public class Test extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        boolean daemon = Thread.currentThread().isDaemon();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (daemon) {
                System.out.println("I am daemon thread " + name);
            } else {
                System.out.println("I am work thread " + name);
            }
        }
    }
}
