package com.proftelran.org.lessonfive;

import java.util.Arrays;

public class AppArrayTwo {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 8, 9, 0}, {7}};
        printArray(arr);
        int[] inner = arr[1];
        inner[2] = 15;
        printArray(arr);

        int[] arrUnsort = {2,4,7,1,3,8,0};

        Arrays.sort(arrUnsort);

        System.out.println(Arrays.toString(arrUnsort));


        String[][] arr1 = {{"[ ]", "[ ]", "[ ]"}, {"[ ]", "[ ]", "[ ]"}, {"[ ]", "[ ]", "[ ]"}};
        printArray(arr1);
    }

    private static void printArray(String[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] arr1) {
        for (int[] ints : arr1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
