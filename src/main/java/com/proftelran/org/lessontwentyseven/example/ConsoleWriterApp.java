package com.proftelran.org.lessontwentyseven.example;

import java.util.Random;

public class ConsoleWriterApp {

    public static void main(String[] args) {

        //create object with Runnable
        ConsoleWriterThread consoleWriterThread = new ConsoleWriterThread();
        // create new child Thread
        Thread thread = new Thread(consoleWriterThread);
        //start child thread
        thread.start();

        //create Random object
        Random random = new Random();
        //main thread sleep for random millis
        try {
            Thread.sleep(random.nextInt(5) * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //call interrupt on child thread
        System.out.println("State is " + thread.getState());
        thread.interrupt();
    }
}
