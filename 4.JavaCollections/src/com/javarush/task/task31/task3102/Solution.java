package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> result = new ArrayList<>();
        List<File> directories = new ArrayList<>();
        directories.add(new File(root));
        while (directories.size() > 0) {
            for (File file : directories.get(0).listFiles()) {
                if (file.isDirectory()) {
                    directories.add(file);
                } else {
                    result.add(file.getAbsolutePath());
                }
            }
            directories.remove(0);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
