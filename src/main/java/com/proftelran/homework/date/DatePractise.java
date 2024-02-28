package com.proftelran.homework.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class DatePractise {

    public static void main(String[] args) {

        //Task 1
        LocalDate myBD = LocalDate.of(2003, Month.JUNE, 10);
        System.out.println(myBD.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));

        //Task 2
        LocalDate date = LocalDate.of(1985, Month.JANUARY, 10);
        System.out.println("" + isFriday(date) + " 10.01.1985 is " + date.getDayOfWeek());

        //Task 3
        System.out.println(date.minusYears(10));

        //Task 4
        System.out.println(Instant.parse("2022-12-29T06:55:30.00Z"));

        //Task 5
        System.out.println(ZonedDateTime.now(ZoneId.of("Pacific/Midway")));
    }

    private static boolean isFriday(LocalDate date) {
        return date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}
