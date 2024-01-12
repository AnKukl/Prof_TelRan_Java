package com.proftelran.org.lessontwentyone;

import com.proftelran.org.lessonfour.ParentTest;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {

    public static void main(String[] args) {
        matchAll("tel", "telrantel.detel");

        List<String> numberList = Arrays.asList(
                "ad4534zx", "ad45345zx", "ads4534zx", "aE4534zx", "ad45R4zx"
        );

        String regex = "[a-z][a-z]\\d\\d[A-Z ]\\d[a-z][a-z]";
        numberList.forEach(number ->{
            System.out.println("Is source " + number + " matches " + regex + " " + " = "+ isMatch(regex, number));

        } );
    }

    private static boolean isMatch(String patternString, String source) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(source);
        return matcher.matches();
    }

    private static void matchAll(String patternString, String source) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(source);

        while (matcher.find()) {
            System.out.println("Matcher found from " + matcher.start() + " to " + (matcher.end() - 1));
        }
    }
}
