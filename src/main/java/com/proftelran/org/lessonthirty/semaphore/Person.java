package com.proftelran.org.lessonthirty.semaphore;

import java.util.concurrent.Semaphore;

public class Person implements Runnable {

    private String name;
    private Semaphore semaphore;
    private boolean[] tables;

    public Person(String name, Semaphore semaphore, boolean[] tables) {
        this.name = name;
        this.semaphore = semaphore;
        this.tables = tables;
    }

    @Override
    public void run() {
        System.out.println(" -> " + name + " подошёл в ресторан");

        try {
            //запрашивает доступ на продолжение выполнения
            semaphore.acquire();
            int occupiedTable = -1;
            synchronized (tables) {
                for (int i = 0; i < tables.length; i++) {
                    if (!tables[i]) {
                        tables[i] = true;
                        occupiedTable = i;
                        System.out.println("[!] " + name + " был размещён за столиком " + (i + 1));
                        break;
                    }
                }
            }
            Thread.sleep(5000);

            synchronized (tables) {
                tables[occupiedTable] = false;
            }

            // освободили доступ
            semaphore.release();
            synchronized (tables) {
                System.out.println("   <- " + name + " закончил ужин и покинул ресторан");
                System.out.println("   [!] Столик с номером " + (occupiedTable + 1) + " освободился");
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
