package com.proftelran.org.lessontwentyseven;

public class DeamonTest {

    public static void main(String[] args) {
        Test test = new Test();
        test.setDaemon(true);
        test.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main thread");

    }
}
