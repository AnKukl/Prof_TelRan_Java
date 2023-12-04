package com.proftelran.org.lessonfive;

public class AppArray {
    public static void main(String[] args) {


        int[] arrayTwo = {1, 2, 3, 4, 5};
        int[] arrayThree = {1, 2, 3, 4, 5};

        if (arrayThree == arrayTwo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String one = "One";
        String two = "One";
        if (one == two) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String three = new String("One");
        if (one == three) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
