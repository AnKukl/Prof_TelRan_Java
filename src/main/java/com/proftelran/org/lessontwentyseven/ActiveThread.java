package com.proftelran.org.lessontwentyseven;

import java.time.LocalTime;

public class ActiveThread extends Thread {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            boolean interrupted = Thread.currentThread().isInterrupted();
            System.out.println("Is interrupted = " + interrupted + " " + LocalTime.now());

            int sum = 0;
            for (int i = 0; i < 1000000000l; i++){  //1000000000l
               sum += i;
           }
        }
    }
}
