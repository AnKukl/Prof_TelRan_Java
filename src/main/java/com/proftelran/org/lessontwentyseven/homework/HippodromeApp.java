package com.proftelran.org.lessontwentyseven.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HippodromeApp {

    public static final int LOOP_LENGTH = 1000;

    public static void main(String[] args) {

        Random random = new Random();
        List<Horse> horses = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            horses.add(new Horse("A" + i, random.nextInt(5)));
        }

        horses.stream().map(Thread::new)
                .toList().forEach(Thread::start);

//        List<Thread> threads = new ArrayList<>();
//        horses.forEach(horse -> threads.add(new Thread(horse)));
//
//        threads.forEach(Thread::start);

//        boolean hasWinner = false;
//        while (!hasWinner) {
//            for (Horse horse : horses) {
//                horse.nextStep();
//                if (horse.getPosition() > LOOP_LENGTH) {
//                    hasWinner = true;
//                    System.out.println("Horse " + horse.getName() + " is finished");
//                    break;
//                }
//            }
//        }
//        for (Horse horse: horses){
//            System.out.println("Horse " + horse.getName() + "| Position " + horse.getPosition());
//        }
    }
}
