package com.proftelran.Homework.FileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class TextCoder {
    private String filename;
    private String encodedFilename;
    private String decodedFilename;
    private Map<Integer, Integer> linesLength = new HashMap<>();
    private int countOfChars = 0;
    private int countOfLines = 0;

    public TextCoder(String filename) {
        this.filename = filename;

    }

    public void encodeText(String encodedFilename) {
        this.encodedFilename = encodedFilename;

        IndexStorage indexStorage = new IndexStorage();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filename))) {
            String line;
            int index = 0;

            while ((line = bufferedReader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    indexStorage.addIndex(c, index);
                    index++;
                    countOfChars++;
                }
                countOfLines++;
                this.linesLength.put(countOfLines, line.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        writeIndexMapToFile(indexStorage.getIndexMap(), this.encodedFilename);
    }

    private void writeIndexMapToFile(Map<Character, List<Integer>> indexMap, String filename) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<Character, List<Integer>> entry : indexMap.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void decodeText(String decodedFilename) {
        this.decodedFilename = decodedFilename;
        StringBuilder decodedText = new StringBuilder();
        decodedText.setLength(countOfChars);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.encodedFilename))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                char character = parts[0].charAt(0);
                String indicesStr = parts[1].replaceAll("\\[|\\]|\\s", "");
                String[] indicesArr = indicesStr.split(",");

                for (String indexStr : indicesArr) {
                    int index = Integer.parseInt(indexStr);
                    decodedText.setCharAt(index, character);
                }
            }
            int breakline = 0;

            for (int i = 1; i < countOfLines; i++) {
                breakline += linesLength.get(i);
                decodedText.insert(breakline, '\n');
                breakline++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(decodedText);
        writeDecodedTextToFile(decodedText.toString(), this.decodedFilename);
    }

    private void writeDecodedTextToFile(String text, String filename) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
