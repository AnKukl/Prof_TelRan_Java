package com.proftelran.org.lessontwentynine.storageSystem;

public class Producer extends Thread {

    private final Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        // Put one good into storage per 1 sec
        //while storage is not full
        int count = 0;

        synchronized (storage) {

            while (true) {

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String good = "A" + ++count;
                boolean result = storage.putGood(good);
                if (!result) {
//                    storage.notify();
                    storage.notifyAll();
                    try {
//                        storage.wait(15000);
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("Put good " + good + " into storage");
                }
            }
        }

    }
}
