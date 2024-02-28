package com.proftelran.org.lessontwentysix.summator;

public class TestSummarize {

    public static int multiSum = 0;  // incorrect!!!! for mth

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3};  // 4, 8, 12 = 24

        SingleThreadSummator singleThread = new SingleThreadSummator(arr);
        singleThread.sum();

        MultiThreadSummator one = new MultiThreadSummator(arr, 0, 4);
        MultiThreadSummator two = new MultiThreadSummator(arr, 4, 8);
        MultiThreadSummator three = new MultiThreadSummator(arr, 8, 12);

        Thread thread1 = new Thread(one);
        Thread thread2 = new Thread(two);
        Thread thread3 = new Thread(three);


        long start = System.currentTimeMillis();  // - main
        thread1.start(); // - Thread-0
        thread2.start(); // - Thread-1
        thread3.start(); // - Thread-2

        // Заставили поток main подождать дочерние потоки
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Time is = " + (System.currentTimeMillis() - start)); // - main
        System.out.println("Sum = " + multiSum);

    }
}
