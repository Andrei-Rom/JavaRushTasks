package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        List<File> foundFiles = new ArrayList<>();

        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);


        Files.walkFileTree(path.toPath(), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file.toFile().length() > 50) {
                    FileUtils.deleteFile(file.toFile());
                } else {
                    foundFiles.add(file.toFile());
                }
                return FileVisitResult.CONTINUE;
            }
        });


        foundFiles.sort(new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(allFilesContent))) {
//            for (File file : foundFiles) {
//                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//                    while (bufferedReader.ready()) {
//                        bufferedWriter.write(bufferedReader.readLine());
//                        bufferedWriter.newLine();
//                    }
//                }
//            }
//        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(allFilesContent));
        for (File file : foundFiles) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.ready()) {
                bufferedWriter.write(bufferedReader.readLine());
                bufferedWriter.newLine();
            }
            bufferedReader.close();
        }
        bufferedWriter.close();
    }
}


