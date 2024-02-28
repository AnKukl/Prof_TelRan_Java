package com.proftelran.homework.hyppodrome;

import java.time.LocalTime;

public class Horse implements Runnable {
    private String name;
    private int step;
    private int position;

    public Horse(String name, int step) {
        this.name = name;
        this.step = step == 0 ? 1 : step;

    }

    private void nextStep() {
        position += step;
    }

    @Override
    public void run() {
        System.out.println("" + name + " starts running " + LocalTime.now());

        while (true) {
            try {
                Thread.sleep(20 - step);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            nextStep();

            if (position > Hippodrome.LOOP_LENGTH) {
                System.out.println("" + name + " finished the race " + LocalTime.now());
                break;
            }
        }
    }
}
