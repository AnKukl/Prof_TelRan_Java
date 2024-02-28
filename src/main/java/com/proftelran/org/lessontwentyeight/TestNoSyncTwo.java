package com.proftelran.org.lessontwentyeight;


import com.proftelran.org.lessontwentyfour.Calculator;

public class TestNoSyncTwo {

    private static int counter = 0;
    private Calculator calculator;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {

            //Mutex, Monitor

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    // 1. - Чтение текущего значения
                    // 2. - увеличение на 1
                    // 3. - присвоение нового значения
                    synchronized (this) {
                        counter++;
                    }
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                    System.out.println(" " + Thread.currentThread().getName() + " : iterator " + i
                            + " : counter " + counter);
                }
            }
        };
        long startTime = System.currentTimeMillis();
        Thread threadOne = new Thread(runnable);
        Thread threadTwo = new Thread(runnable);
        Thread threadThree = new Thread(runnable);

        System.out.println();


        threadOne.start();
        threadTwo.start();
        threadThree.start();

        //join - усыпляет поток в котором он вызванб до того момента пока поток который вызван не завершит работу
        threadOne.join();
        threadTwo.join();
        threadThree.join();

        System.out.println("Counter = " + counter);
        System.out.println("Execute time = " + (System.currentTimeMillis() - startTime));

    }
}
