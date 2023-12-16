package com.proftelran.Homework.FileChangingTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileChanging {
    public static void main(String[] args) {
        // Task 1
        String pathToFile = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\Homework\\FileChangingTest\\";
        String text = "This is my first experience when I myself work with IO API. I can do everything!";
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile + "file.txt")) {
            byte[] byteText = text.getBytes();
            fileOutputStream.write(byteText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Task 2
        File file2 = new File(pathToFile + "\\newFile.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File " + file2 + " was created: " + file2.exists());
        boolean deleted = file2.delete();
        System.out.println("File " + file2 + " was deleted: " + deleted);

        //Task 3
        File directory = new File(pathToFile + "\\DirectorySample");
        FileChanging.directoryDeleting(directory);

    }

    public static void directoryDeleting(File directory) {
        //Если директорий отсутствует
        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }
        //Декомпозиция директории на файлы
        File[] files = directory.listFiles();
        //Обработка отдельных файлов
        if (files != null) {
            for (File file : files) { // Проверка не является ли заданный путь директорией
                if (file.isDirectory()) {
                    directoryDeleting(file);
                } else {
                    if (file.delete()) {
                        System.out.println("Deleted file: " + file.getAbsolutePath());
                    } else {
                        System.out.println("Failed to delete file: " + file.getAbsolutePath());
                    }
                }
            }
        }
        // Удаление текущей директории
        if (directory.delete()) {
            System.out.println("Deleted directory: " + directory.getAbsolutePath());
        } else {
            System.out.println("Failed to delete directory: " + directory.getAbsolutePath());
        }
    }
}