package com.proftelran.org.lessonthirty.exchanger;

import java.util.Random;
import java.util.concurrent.Exchanger;

public class Truck implements Runnable {

    private int number;
    private String[] parcels;
    private Exchanger<String> exchanger;

    public Truck(int number, String[] parcels, Exchanger<String> exchanger) {
        this.number = number;
        this.parcels = parcels;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        Random random = new Random();

        System.out.println("Truck " + number + " parcels are " + parcels[0] + " - " + parcels[1]);
        try {
            Thread.sleep(random.nextInt(2) * 1000L);
            System.out.println("Truck " + number + " in exchange point");
            String parcel = exchanger.exchange(parcels[1]);
            parcels[1] = parcel;
            Thread.sleep(random.nextInt(2) * 1000L);

            System.out.println("Truck " + number + " parcels are " + parcels[0] + " - " + parcels[1]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
