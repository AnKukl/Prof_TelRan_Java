package com.proftelran.Homework.HWRegexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
//        Task #1
        String num = "456-3456";
        System.out.println("This phone number is correct: " + checkNumber(num));
//        Task #2
        String email = "shishk_32@gmail.com";
        System.out.println("This email is correct: " + checkEmail(email));
//        Task #3
        String password = "alskdfh";
        System.out.println("This email is correct: " + checkPassword(password));
        String password2 = "234oLdyr.e";
        System.out.println("This email is correct: " + checkPassword(password2));
    }

    public static boolean checkNumber(String phoneNumber) {
        String regex = "(\\d{7}|\\d{3}\\s\\d{4}|\\d{3}\\-\\d{4})";
        if (phoneNumber == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean checkEmail(String email) {
        String regex = "\\w+@\\w+\\.\\w+";
        if (email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean checkPassword(String password) {
        String regex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!^&*()_.-]).{8,}";
        if (password == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
