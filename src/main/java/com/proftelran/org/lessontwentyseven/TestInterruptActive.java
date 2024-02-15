package com.proftelran.org.lessontwentyseven;

public class TestInterruptActive {

    public static void main(String[] args) {
        ActiveThread activeThread = new ActiveThread();
        activeThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        activeThread.interrupt();
    }
}
