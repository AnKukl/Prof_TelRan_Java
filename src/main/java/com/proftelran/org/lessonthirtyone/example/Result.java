package com.proftelran.org.lessonthirtyone.example;

import java.time.LocalTime;
import java.util.concurrent.Callable;

public class Result implements Callable {

    private int number;

    public Result(int number) {
        this.number = number;
    }

    @Override
    public Object call() throws Exception {
        Thread.sleep((long) (Math.random() * 3500));
        return number + " " + Thread.currentThread().getName() + " " + LocalTime.now();
    }
}
