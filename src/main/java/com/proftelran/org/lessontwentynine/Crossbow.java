package com.proftelran.org.lessontwentynine;

public class Crossbow {

    private int arrows = 10;

    public synchronized void fire() {

        while (arrows >= 0) {
            if (arrows == 0) {
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("We have " + arrows);
            arrows--;
        }
//            for (int idx = arrows; idx >= 0; idx--) {
//                if (idx != 0) {
//                    System.out.println("We have " + (arrows - idx + 1));
//                } else {
//                    System.out.println("The arrows are over");
//                    arrows = 0;
//
//                    try {
//                        wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//        }
    }

    public synchronized void reload() {
        while (true) {
            System.out.println("Reload - new arrows on the way ");
            arrows = 10;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Count of arrows = " + arrows);
            notify();

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
