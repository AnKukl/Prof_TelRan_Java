package com.proftelran.org.lessontwentyfive;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println();

        GregorianCalendar gregorianCalendar = new GregorianCalendar(2024, Calendar.JANUARY, 10);
        System.out.println(gregorianCalendar);

        int month = calendar.get(Calendar.MONTH);
        System.out.println("Month is: " + month);

        int dataOfNumber = calendar.get(5);
        System.out.println("Day is: " + dataOfNumber);

        gregorianCalendar.set(2023, Calendar.DECEMBER, 25);
        System.out.println(gregorianCalendar);

        gregorianCalendar.add(Calendar.MONTH, 2);
        System.out.println(gregorianCalendar);

        gregorianCalendar.add(Calendar.MONTH, -5);
        System.out.println(gregorianCalendar);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(new Date());
        System.out.println("Formatted date is: " + format);

        calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(calendar.getTime());
        System.out.println("Formatted date from calendar is: " + formattedDate);


    }
}
