package com.proftelran.org.lessontwentyone;

import java.util.regex.Pattern;

public class TestSplit {

    public static void main(String[] args) {
        String text = "I learned about TelRan College and now I am studying Java";
        String[] strings = text.split(" ");

        for (String temp : strings) {
            System.out.print(temp);
        }
        System.out.println();

        String text1 = "I+learned+about+TelRan+College+and+now+I+am+studying+Java";
        String[] strings1 = text1.split("\\+");
        for (String temp : strings1) {
            System.out.print(temp);
        }
        System.out.println();

        String text2 = "I1learned2about3TelRan4College5and6now7I8am9studying0Java";
        String[] strings2 = text1.split("\\d");
        for (String temp : strings1) {
            System.out.print(temp);
        }
        System.out.println();

        Pattern pattern = Pattern.compile("\\d{]");
        String[] split = pattern.split(text2);
    }
}
