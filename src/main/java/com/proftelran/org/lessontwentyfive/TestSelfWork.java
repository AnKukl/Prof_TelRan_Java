package com.proftelran.org.lessontwentyfive;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestSelfWork {
    public static void main(String[] args) {

        boolean b = checkYear(2024);
        System.out.println("Is 2024 leap year: " + b);
    }

    private static boolean checkYear(int year){
        return new GregorianCalendar().isLeapYear(year);
    }
}
