package com.proftelran.org.lessontwentyfive;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class TestClassLocalDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int year = date.getYear();
        Month month = date.getMonth();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(" " + year + " " + " " +  month + " " + dayOfMonth + " " + dayOfWeek );

        LocalDate currentDate = LocalDate.of(2024,2,13);
        System.out.println(currentDate);
        System.out.println(currentDate.getMonth());

        currentDate = currentDate.plusYears(2);
        currentDate = currentDate.plusDays(24);
        currentDate = currentDate.plusMonths(3);
        System.out.println(currentDate);

        currentDate = currentDate.minusYears(5);
        currentDate = currentDate.minusMonths(4);
        currentDate = currentDate.minusDays(9);
        System.out.println(currentDate);

    }
}
