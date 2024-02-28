package com.proftelran.org.lessonthirty.exchanger;

import java.util.concurrent.Exchanger;

public class TestExchange {

    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();
        //a go to d
        String[] pOne = {"A -> D", "A -> C"};
        //b go to c
        String[] pTwo = {"B -> C", "B -> D"};

        new Thread(new Truck(1, pOne, exchanger)).start();

        Thread.sleep(200);

        new Thread(new Truck(2, pTwo, exchanger)).start();
    }
}
