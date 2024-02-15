package com.proftelran.org.lessontwentyfive;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TestZoneDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        ZoneId zoneId = ZoneId.systemDefault();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zoneId);
        System.out.println(zonedDateTime);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String zone: availableZoneIds){
            System.out.println("Zone -> " + zone);
        }
    }
}
