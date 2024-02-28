package com.proftelran.org.lessonthirtyone.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestResult {

    public static void main(String[] args) {
        List<Future<String>> resultList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 20; i++) {
            Future<String> submit = executorService.submit(new Result(i + 1));
            resultList.add(submit);
        }

        Thread thread = new Thread(new ResultPrinterTwo(resultList));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
//        executorService.submit(new ResultPrinter(resultList));


    }
}
