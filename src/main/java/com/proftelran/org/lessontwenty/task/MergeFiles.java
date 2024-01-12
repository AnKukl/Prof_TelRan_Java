package com.proftelran.org.lessontwenty.task;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeFiles {

    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\48793\\IdeaProjects\\proftelrncourse1\\src\\main\\java\\com\\proftelran\\org\\lessontwenty\\task";
        List<String> result = new ArrayList<>();
        String inputNames = "A_B_C_D";
        MergeFiles mergeFiles = new MergeFiles();
        String[] s = inputNames.split("_");
        Arrays.stream(s).forEach(name -> {
            result.add(mergeFiles.getDataFromFile(pathToFile + "\\" + name + ".txt"));
        });
        System.out.print(result);
        String pathToOutFile = pathToFile + "\\outputfile.txt";
//        result.stream().forEach(content -> mergeFiles.writeDataToFile(pathToOutFile, content));
        mergeFiles.writeDataToFile(pathToOutFile,
        result.stream().collect(Collectors.joining(" "))); // - собирает строки листа в одну через символ Delimiter

    }

    private void writeDataToFile(String path, String content){
        try(FileWriter writer = new FileWriter(path)){
            writer.append(content);
//            writer.write(content);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private String getDataFromFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            while (reader.ready()) {
                sb.append((char) reader.read());
            }

        } catch (Exception exception) {

        }
        return sb.toString();
    }
}
