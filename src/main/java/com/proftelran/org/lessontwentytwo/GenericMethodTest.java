package com.proftelran.org.lessontwentytwo;

public class GenericMethodTest {

    public static void main(String[] args) {

        printClassName("Hello");
        printClassName(5);
        printClassName(1.5);

        printClassNameTwo("Hello Again");
        printClassNameTwo(24);
        printClassNameTwo(1.6);


    }

    public static void printClassName(Object elm) {
        System.out.println(elm.getClass().getName() + " = " + elm);
    }

    public static <T> void printClassNameTwo(T elm) {
        System.out.println(elm.getClass().getName() + " = " + elm);
    }
}
