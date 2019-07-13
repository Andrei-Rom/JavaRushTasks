package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution  {
    private static int countDirectories;
    private static int countFiles;
    private static long size;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fullPath = reader.readLine();
            Path directory = Paths.get(fullPath);
            if (!Files.isDirectory(directory)) {
                System.out.format("%s - не папка%n", fullPath);
            } else {
                Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                            countDirectories++;
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        countFiles++;
                        size += attrs.size();
                        return FileVisitResult.CONTINUE;
                    }
                });
                System.out.format("Всего папок - %d%n", --countDirectories);
                System.out.format("Всего файлов - %d%n", countFiles);
                System.out.format("Общий размер - %d%n", size);

            }
        }
    }
}
