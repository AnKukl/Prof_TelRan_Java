package com.proftelran.org.lessontwentysix.parentandchild;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestPC {

    public static void main(String[] args) {

        System.out.println("Main thread start " + LocalTime.now());
        new Thread(new ChildThread()).start();
        try {
            Thread.sleep(1000); // main
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread stop " + LocalTime.now());
    }
}
