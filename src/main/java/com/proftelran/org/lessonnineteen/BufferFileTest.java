package com.proftelran.org.lessonnineteen;

import java.io.*;
import java.util.Scanner;

public class BufferFileTest {

    public static void main(String[] args) throws Exception { //BAD IDEA

        String pathToFile = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\org\\lessonnineteen\\";
//        FileInputStream fileInputStream = new FileInputStream(pathToFile + "\\file.txt");
//
//        InputStream in = fileInputStream;
//        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//
//
//        reader.lines().forEach(System.out::println);
//        reader.close();


        FileInputStream fileInputStream2 = new FileInputStream(pathToFile + "\\file.txt");
        Scanner scanner = new Scanner(fileInputStream2);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        fileInputStream2.close();


    }
}
