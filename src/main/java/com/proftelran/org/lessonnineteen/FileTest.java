package com.proftelran.org.lessonnineteen;

import java.io.File;
import java.util.Arrays;

public class FileTest {

    public static void main (String[] args) {
        //1.Create a File
        String path = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\org\\lessonnineteen\\";
        File file = new File(path + "\\file.txt");

        boolean exists = file.exists();
        System.out.println("file exists " + exists);

        System.out.println(file.isDirectory());
        File fileDirectory = new File(path);
        System.out.println("fileDirectory is directory " + fileDirectory.isDirectory());

        //Create a directory - newdirectory;
        File fileNewDir = new File(path + "\\newdirectory");
        System.out.println("fileNewDir exists " + fileNewDir.exists());
        boolean created = fileNewDir.mkdir();
        System.out.println("Was created " + created);

        System.out.println("Length of file " + file.length());

        //5.File delete
        File fileToDelete = new File(path + "\\filNew.txt");
        boolean delete = fileToDelete.delete();
        System.out.println("filTwo.txt delete ? " + delete);

//        List of files
        String[] list = fileDirectory.list();
        System.out.println(Arrays.toString(list));

        File[] files = fileDirectory.listFiles();
        for (File elementFile : files) {
            System.out.println(elementFile.getName() + " " + elementFile.length());
        }

    }
}
