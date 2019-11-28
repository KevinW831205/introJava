package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class ReadingExistingDirectoryContents {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path entry) throws IOException {
//                        return (Files.isRegularFile(entry));
//                    }
//                };

        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

//        Path directory = FileSystems.getDefault().getPath("Examples\\Dir2");
        Path directory = FileSystems.getDefault().getPath("Examples"+File.separator+ "Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {

            for (Path file : contents) {
                System.out.println(file.getFileName());
            }

        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);
    }


}
