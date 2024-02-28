package com.proftelran.org.lessontwentyfour;

public class ArrayApp {

    public static void main(String[] args) {
        ArrayOperation aop = new ArrayOperation();
        System.out.println("Max = " + aop.findMax(new int[]{1, 3, 4, 5, 2, 7, 39, 54, 6}));
        System.out.println("Min = " + aop.findMin(new int[]{10, 3, 4, 5, 2, 7, 39, 0, -54, 6}));
        System.out.println("Min = " + aop.findMin(new int[3]));
        try {
            System.out.println("Min = " + aop.findMin(null));

        } catch (IllegalArgumentException exception) {
            System.out.println("Wrong input data");
        }
    }

}
