package com.proftelran.org.lessontwenty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class TestFis {

    //FileInputStream
    //FileOutputStream
    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\org\\lessontwenty";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(pathToFile + "\\ile1.txt");
            System.out.println("Available bytes in file " + fileInputStream.available());
            fileInputStream.skip(5);
            while (fileInputStream.available() > 0) {
                System.out.print(" " + (char) fileInputStream.read());
            }
            fileInputStream.close();

        } catch (IOException exception) {
            System.out.println("We have a problem " + exception.getMessage());
        }
        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            System.out.println("Try to use closed stream");
            e.printStackTrace();
        }

        //___________________________________________________________________

        FileReader fileReader;
        try {
            fileReader = new FileReader(pathToFile + "\\ile1.txt");
            char[] chars = new char[20];
            int count = 0;
            while(fileReader.ready()){
                int read = fileReader.read(chars);
                System.out.println(Arrays.toString(chars) + "count chars = " + read);
                count++;
            }
            System.out.println("Numbeer of reads " + count);
        } catch (IOException e) {
            System.out.println("We have a problem " + e.getMessage());
            e.printStackTrace();
        }

    }
}
