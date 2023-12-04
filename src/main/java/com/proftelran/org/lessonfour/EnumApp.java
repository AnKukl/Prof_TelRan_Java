package com.proftelran.org.lessonfour;
import java.util.Scanner;
public class EnumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input current day :");
        String dayAsString = scanner.nextLine().toUpperCase();
        Day input = null;
        for (Day value : Day.values()) {
            if (dayAsString.equals(value.name())) {
                input = value;
            }
        }
        if (input == null) {
            System.out.println("Incorrect");
            System.exit(0);
        }

        switch (input) {
            case FRIDAY:
                System.out.println("Hurrraaa");
                break;
            case MONDAY:
                System.out.println("(((");
                break;
            default:
                System.out.println("Other");
        }
    }

    public static void printAllDays() {
        Day[] values = Day.values();
        for (Day value : values) {
            System.out.println(value);
        }
    }
}
