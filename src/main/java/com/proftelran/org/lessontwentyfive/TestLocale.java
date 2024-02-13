package com.proftelran.org.lessontwentyfive;

import java.util.Date;
import java.util.Locale;

public class TestLocale {

    public static void main(String[] args) {
        Locale locale = new Locale("ja");
//        Locale.setDefault(locale); Устанавливает дефолтную локаль по умолчанию
        Date date = new Date();
        System.out.println("Date is: " + date);
        System.out.println(String.format(locale, "%tc\n", date));
        System.out.println(String.format(locale, "%tD\n", date));
        System.out.println(String.format(locale, "%tF\n", date));
        System.out.println(String.format(locale, "%tr\n", date));
        System.out.println(String.format(locale, "%tz\n", date));
        System.out.println(String.format(locale, "%tZ\n", date));
    }
}
