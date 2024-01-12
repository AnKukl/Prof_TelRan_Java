package com.proftelran.Homework.FileReader;

import java.util.List;
import java.util.Map;
import java.io.*;

public class FileAnalyzer {

    public static void main(String[] args) {
        Storage<Character> characterStorage = new Storage<>();
        Storage<Integer> integerStorage = new Storage<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\Homework\\FileReader\\testFile.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                for (char c :
                        line.toCharArray()) {
                    if (Character.isDigit(c)) {
                        integerStorage.addElement(Character.getNumericValue(c));
                    } else {
                        characterStorage.addElement(c);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        writeToFile(characterStorage.getElements(), "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\Homework\\FileReader\\customHash.txt");
        writeToFile(integerStorage.getElements(), "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\Homework\\FileReader\\customNumbers.txt");

        String fileName = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\Homework\\FileReader\\testFile.txt";
        String encodedFile = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\Homework\\FileReader\\encodedFile.txt";
        String decodedFile = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\Homework\\FileReader\\decodedFile.txt";

        TextCoder obj = new TextCoder(fileName);
        obj.encodeText(encodedFile);
        obj.decodeText(decodedFile);
        compareFiles(fileName, decodedFile);
    }

    private static <T> void writeToFile(Map<T, Integer> elements, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<T, Integer> entry : elements.entrySet()) {
                writer.write(entry.getKey().toString() + entry.getValue() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void compareFiles(String originalFilename, String decodedFilename) {
        try (BufferedReader originalReader = new BufferedReader(new FileReader(originalFilename));
             BufferedReader decodedReader = new BufferedReader(new FileReader(decodedFilename))) {

            String originalLine;
            String decodedLine;
            boolean result = false;
            while ((originalLine = originalReader.readLine()) != null &&
                    (decodedLine = decodedReader.readLine()) != null) {
              result = originalLine.equals(decodedLine);
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
