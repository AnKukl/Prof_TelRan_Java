package com.proftelran.org.lessonthirtyone;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadFixedExecutor {

    public static void main(String[] args) {

        String[] stages = {"1.Project", "2.Start  ", "3.Finish ", "4.Final  "};
        CountDownLatch cd1 = new CountDownLatch(stages.length);
        CountDownLatch cd2 = new CountDownLatch(stages.length);
        CountDownLatch cd3 = new CountDownLatch(stages.length);
        CountDownLatch cd4 = new CountDownLatch(stages.length);

        System.out.println("Start threads");

        ExecutorService executorService = Executors.newFixedThreadPool(2 );

        Building dussledorf = new Building("Dussledorf", cd1, stages);
        executorService.execute(dussledorf);

        executorService.execute(new Building("Calgiari", cd2, stages));
        executorService.execute(new Building("Dortmund", cd3, stages));
        executorService.execute(new Building("Oslo", cd4, stages));

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
