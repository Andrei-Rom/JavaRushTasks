package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private Path rootPath;
    private List<Path> fileList;

    public FileManager(Path rootPath) throws IOException {
        this.rootPath = rootPath;
        this.fileList = new ArrayList<>();
        collectFileList(rootPath);
    }

    public List<Path> getFileList() {
        return fileList;
    }

    private void collectFileList(Path path) throws IOException {
        // Добавляем только файлы
        if (Files.isRegularFile(path)) {
            Path relativePath = rootPath.relativize(path);
            fileList.add(relativePath);
        }

        // Добавляем содержимое директории
        if (Files.isDirectory(path)) {
            // Рекурсивно проходимся по всему содержмому директории
            // Чтобы не писать код по вызову close для DirectoryStream, обернем вызов newDirectoryStream в try-with-resources
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
                for (Path file : directoryStream) {
                    collectFileList(file);
                }
            }
        }
    }

//    private void collectFileList(Path path) throws IOException {
//        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
//            @Override
//            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                fileList.add(rootPath.relativize(file));
//                return super.visitFile(file, attrs);
//            }
//        });
//    }

//    private void collectFileList(Path path) throws IOException {
//        if (Files.isRegularFile(path)) {
//            fileList.add(rootPath.relativize(path));
//        }
//        if (Files.isDirectory(path)) {
//            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
//                for (Path tempPath : directoryStream) {
//                    collectFileList(tempPath);
//                }
//            }
}
