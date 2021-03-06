package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
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

        Path path3 = FileSystems.getDefault().getPath("thisDNE.txt");
        System.out.println(path3.toAbsolutePath());

        Path path4 = Paths.get("K:\\Volumes\\DNE","something.txt");
        System.out.println(path4.toAbsolutePath());
        System.out.println("Path4 exists: "+Files.exists(path4));

        filePath = FileSystems.getDefault().getPath("Files");
        System.out.println("Exists: "+Files.exists(filePath));
        */
        /*
        Files.isExecutable();
        Files.isReadable();
        Files.isWritable();
         */

        try{
//            Path sourceFile = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples","filecopy.txt");
//            Files.copy(sourceFile,copyFile,StandardCopyOption.REPLACE_EXISTING);

//            sourceFile = FileSystems.getDefault().getPath("Examples","Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.copy(sourceFile,copyFile,StandardCopyOption.REPLACE_EXISTING);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples","filecopy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","Dir1","filecopy.txt");
//            Files.move(fileToMove, destination);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","file1moved.txt");
//            Files.move(fileToMove, destination);

//            Path fileToDelete = FileSystems.getDefault().getPath("Examples","Dir1","filecopy.txt");
//            Files.delete(fileToDelete);



//            Path fileToCreate = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.createFile(fileToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.createDirectory(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//            Files.createDirectories(dirToCreate);

            Path filePath = FileSystems.getDefault().getPath("Examples","Dir1\\file1.txt");
            long size = Files.size(filePath);
            System.out.println("size "+size);
            System.out.println("last modified "+Files.getLastModifiedTime(filePath));

            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("size "+attr.size());
            System.out.println("last modified "+attr.lastModifiedTime());
            System.out.println("created "+attr.creationTime());
            System.out.println("is directory = "+attr.isDirectory());
            System.out.println("is regular file "+attr.isRegularFile());


        } catch (IOException e){
            System.out.println(e.getMessage());
        }



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
