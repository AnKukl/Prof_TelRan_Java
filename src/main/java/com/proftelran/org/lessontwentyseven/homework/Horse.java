package com.proftelran.org.lessontwentyseven.homework;

import java.time.LocalTime;

public class Horse implements Runnable {

    private final String name;
    private final int step;

    private int position;

    public Horse(String name, int step) {
        this.name = name;
        this.step = step == 0 ? 1 : step;
    }

    public String getName() {
        return name;
    }

    public void nextStep() {
        position += step;
    }

    @Override
    public void run() {
        System.out.println(name + " starts running  " + LocalTime.now());
        while (true) {
            try {
                Thread.sleep(20 - step);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextStep();
            if (position > HippodromeApp.LOOP_LENGTH) {
                System.out.println(name + " is finished  " + LocalTime.now());
                break;
            }
        }
    }
}
