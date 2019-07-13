package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        boolean flag = true;

        if (partOfName != null) {
            flag &= file.getFileName().toString().contains(partOfName);
        }
        if (partOfContent != null) {
            String stringContent1 = new String(Files.readAllBytes(file));
            flag &= stringContent1.contains(partOfContent);
        }
        if (maxSize > 0) {
            flag &= Files.size(file) < maxSize;
        }
        if (minSize > 0) {
            flag &= Files.size(file) > minSize;
        }

        if (flag) {
            foundFiles.add(file);
        }

        return FileVisitResult.CONTINUE;
    }
}
