package com.proftelran.org.lessontwentynine.storageSystem;

public class Consumer extends Thread {

    private final Storage storage;

    private boolean isOdd;

    public Consumer(Storage storage, boolean isOdd) {
        this.storage = storage;
        this.isOdd = isOdd;
    }

    @Override
    public void run() {
        // Take every 5 sec one good from storage
        //While storage is not empty

            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String good = storage.getGood(5);
                if (good != null) {
                    System.out.println("Get good with name: " + good);
                } else {
                    System.out.println("We get all goods from storage");
                    synchronized (storage) {
                        storage.notify();
                        try {
        //storage.wait(15000);
                            storage.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
    }
}
