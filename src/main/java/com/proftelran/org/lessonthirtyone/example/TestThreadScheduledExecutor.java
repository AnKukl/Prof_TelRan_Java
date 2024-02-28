package com.proftelran.org.lessonthirtyone.example;

import com.proftelran.org.lessonthirtyone.Building;

import java.util.concurrent.*;

public class TestThreadScheduledExecutor {

    public static void main(String[] args) {
        String[] stages = {"1.Project", "2.Start  ", "3.Finish ", "4.Final  "};
        CountDownLatch cd1 = new CountDownLatch(stages.length);
        CountDownLatch cd2 = new CountDownLatch(stages.length);
        CountDownLatch cd3 = new CountDownLatch(stages.length);
        CountDownLatch cd4 = new CountDownLatch(stages.length);

        System.out.println("Start threads");

//        ExecutorService executorService = Executors.newCachedThreadPool();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);

        Building dussledorf = new Building("Dussledorf", cd1, stages);
        executorService.schedule(dussledorf, 3, TimeUnit.SECONDS);

        executorService.schedule(new Building("Calgiari", cd2, stages), 7, TimeUnit.SECONDS);
        executorService.schedule(new Building("Dortmund", cd3, stages), 4, TimeUnit.SECONDS);
        executorService.schedule(new Building("Oslo", cd4, stages), 2, TimeUnit.SECONDS);

//        executorService.scheduleWithFixedDelay();
//        executorService.scheduleAtFixedRate();

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        executorService.shutdown();
        System.out.println("End threads");
    }
}
