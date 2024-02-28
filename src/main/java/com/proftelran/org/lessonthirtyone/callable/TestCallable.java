package com.proftelran.org.lessonthirtyone.callable;

import java.util.concurrent.*;

public class TestCallable {

    public static void main(String[] args) throws Exception {

        StringGenerator stringGenerator = new StringGenerator();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Start thread");
        Future<String> result = executorService.submit(stringGenerator);
        System.out.println("Submit thread");

//        int count = 0;
//        while (!result.isDone()) {
//            System.out.println("Attempt " + count++);
//            Thread.sleep(100);
//        }
        String s = null;
        try {
            s = result.get(2000, TimeUnit.MILLISECONDS);
        } catch(TimeoutException e){
            System.out.println(e.getMessage());
        }
        System.out.println(s);


        System.out.println("End thread");
        executorService.shutdown();
    }
}
