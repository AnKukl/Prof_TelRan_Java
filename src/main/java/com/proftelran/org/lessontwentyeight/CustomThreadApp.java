package com.proftelran.org.lessontwentyeight;

public class CustomThreadApp {

    public static void main(String[] args) throws InterruptedException {

        Object monitorOne = new Object();
        Object monitorTwo = new Object();

        CustomThread threadOne = new CustomThread(monitorOne);
        CustomThread threadTwo = new CustomThread(monitorTwo);

        threadOne.start();
        Thread.sleep(2000);
        System.out.println("State for one thread " + threadOne.getName() + " " + threadOne.getState());
        threadTwo.start();
        Thread.sleep(2000);
        System.out.println("State for two thread " + threadTwo.getName() + " " + threadTwo.getState());

    }
}
