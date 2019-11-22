package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Path path = FileSystems.getDefault().getPath("WorkingDirectory.txt");
        printFile(path);
        Path filePath = FileSystems.getDefault().getPath("Files", "SubDirectory.txt");
        printFile(filePath);


    }

    private static void printFile(Path path) {

        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
