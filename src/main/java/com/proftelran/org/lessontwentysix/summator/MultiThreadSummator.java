package com.proftelran.org.lessontwentysix.summator;

import static com.proftelran.org.lessontwentysix.summator.TestSummarize.multiSum;

public class MultiThreadSummator implements Runnable {
    private final int[] array;
    private final int startIndex;
    private final int endIndex;

    public MultiThreadSummator(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        sum();
    }

    public void sum() {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += array[i];
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum = " + sum);
        multiSum += sum; // - incorrect !!!!!!!

    }

}
