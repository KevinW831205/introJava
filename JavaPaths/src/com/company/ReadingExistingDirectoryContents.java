package com.company;

import java.io.IOException;
import java.nio.file.*;

public class ReadingExistingDirectoryContents {

    public static void main(String[] args) {

//        DirectoryStream<Path> filter = new DirectoryStream.Filter<Path>(){
//            @Override
//            public boolean accept(Path entry) throws IOException {
//                return Files.isRegularFile(entry);
//            }
//        }

        Path directory = FileSystems.getDefault().getPath("Examples\\Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory,"*.dat")) {

            for (Path file : contents){
                System.out.println(file.getFileName());
            }

        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

    }


}
