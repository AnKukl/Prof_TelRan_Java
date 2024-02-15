package com.proftelran.org.lessontwentyfive;

import java.time.LocalDateTime;

public class TestLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        currentDateTime = currentDateTime.plusYears(4);
        currentDateTime = currentDateTime.plusSeconds(35);
        System.out.println(currentDateTime);


    }
}
