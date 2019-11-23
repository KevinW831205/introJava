package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Path path = FileSystems.getDefault().getPath("WorkingDirectory.txt");
        printFile(path);
        Path filePath = FileSystems.getDefault().getPath("Files", "SubDirectory.txt");
        printFile(filePath);
//        filePath = Paths.get("K:\\Java\\OutThere.txt");
        filePath = Paths.get("K:\\","Java","OutThere.txt");
        printFile(filePath);

        filePath = Paths.get(".","Files","SubDirectory.txt");
        System.out.println(filePath.toAbsolutePath());

        Path path2 = FileSystems.getDefault().getPath(".","Files","..","Files","SubDirectory.txt");
        printFile(path2.normalize());


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
