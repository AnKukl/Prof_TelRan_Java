package com.proftelran.org.lessontwentysix;

public class OutputThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Input word: ");
            i++;
        }
    }
}
