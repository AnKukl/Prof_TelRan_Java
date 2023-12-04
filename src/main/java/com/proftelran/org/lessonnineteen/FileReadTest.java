package com.proftelran.org.lessonnineteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReadTest {

    public static void main(String[] args) {

        //  try {
        //        zdes mb problema - exception
        //  } catch(Exception e) {
        //        handle exception
        //  }
        String pathToFile = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\org\\lessonnineteen\\";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathToFile + "\\file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(pathToFile + "\\filNew.txt");

            int data = fileInputStream.read();
            while(data != -1){
                //System.out.print((char) data);
                fileOutputStream.write(data);
                data = fileInputStream.read();
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
