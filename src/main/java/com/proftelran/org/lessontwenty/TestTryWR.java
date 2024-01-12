package com.proftelran.org.lessontwenty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTryWR {

    public static void main(String[] args) {

        //try-With-Resources

//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
//            String s = reader.readLine();
//        } catch (Exception e) {
//            //log.debug("Text")
//            throw new IllegalArgumentException();
//        }

        try (CustomReader reader = new CustomReader()) {
            int[] array = {12};
            System.out.println(array[0]);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
