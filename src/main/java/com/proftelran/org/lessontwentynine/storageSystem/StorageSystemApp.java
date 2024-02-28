package com.proftelran.org.lessontwentynine.storageSystem;

import java.util.ArrayList;
import java.util.List;

public class StorageSystemApp {

    public static void main(String[] args) {
        Storage storage = new Storage();

        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage, true);
        Consumer consumer2 = new Consumer(storage, false);

        new Thread(producer).start();

        new Thread(consumer).start();
        new Thread(consumer2).start();


    }
}
