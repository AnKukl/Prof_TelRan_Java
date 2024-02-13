package com.proftelran.org.lessontwentyfive;

import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
        // 1 Jan 1970

        //Get current date
        Date date = new Date();
        System.out.println("Current date is " + date);
        //Create date from milliseconds
        Date date2 = new Date(235628657000L);
        System.out.println("Date is " + date2);

//        Date date3 = new Date(2023, 11, 12);
//        System.out.println("Date is " + date3);

        Date dateOne = new Date();
        for (int i = 0; i < 1000000; i++) {
            int size = i;
        }
        Date dateTwo = new Date();

        long timeOne = dateOne.getTime();
        long timeTwo = dateTwo.getTime();
        System.out.println("difference is " + (timeTwo - timeOne));

        // check 1 more than 2
        boolean after = dateOne.after(dateTwo);
        System.out.println("DateOne less than DateTwo: " + after);

        // check 1 less than 2
        boolean before = dateOne.before(dateTwo);
        System.out.println("DateOne less than DateTwo: " + before);

        int result = dateOne.compareTo(dateTwo);
        System.out.println("Result of compare: " + result);

        int result2 = dateTwo.compareTo(dateOne);
        System.out.println("Result of compare: " + result2);

//        Thread.sleep(2000); приглушает программу на n милисекунд


    }
}
