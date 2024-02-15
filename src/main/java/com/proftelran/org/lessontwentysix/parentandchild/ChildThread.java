package com.proftelran.org.lessontwentysix.parentandchild;

import java.time.LocalTime;

public class ChildThread implements Runnable {
    @Override
    public void run() {

        System.out.println("Child thread starts " + LocalTime.now());
        try {
            Thread.sleep(5000); //child
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread stopped " + LocalTime.now());
    }
}
