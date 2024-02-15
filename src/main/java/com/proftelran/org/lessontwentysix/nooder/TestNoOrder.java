package com.proftelran.org.lessontwentysix.nooder;

public class TestNoOrder {

    public static void main(String[] args) {

        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Printer printer3 = new Printer();

        new Thread(printer1).start();
        new Thread(printer2).start();
        new Thread(printer3).start();
    }
}
