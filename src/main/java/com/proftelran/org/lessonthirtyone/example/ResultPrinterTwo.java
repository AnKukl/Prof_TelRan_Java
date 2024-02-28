package com.proftelran.org.lessonthirtyone.example;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ResultPrinterTwo implements Runnable{

    private List<Future<String>> resultList;
    public ResultPrinterTwo(List<Future<String>> resultList) {
        this.resultList = resultList;
    }

    @Override
    public void run() {

            for (Future<String> result : resultList) {
                String s = null;
                try {
                    s = result.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(s);
            }

    }
}
