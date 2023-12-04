package com.proftelran.org.lessonnineteen;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Date;
import java.util.Scanner;

public class IOStreamTest {

    public static void main(String[] args) {
        //OutputStream, InputStream - byte stream
        //Reader, Writer - char stream

        //System.out
        OutputStream out = System.out;
        System.out.println("Hello"); //standard stream for output
        System.out.printf("%b%n", null);


        int x = 100;
        System.out.printf("Print integer : x = %d\n", x);

        float y = 3.14f;
        System.out.printf("Formatted float y = %.6f\n", y);

        Date date = new Date();
        System.out.printf("hours %tH : minutes %tM : seconds %tS", date, date, date);

        //System.in
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        //System.err

        PrintStream err = System.err;
        System.err.println();
        System.err.println("Hello world");


    }
}
