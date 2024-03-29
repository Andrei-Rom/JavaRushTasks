package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) return;

        String fileName = args[0];
        String zipName = args[1];
        File file = new File(fileName);
        Map<String, ByteArrayOutputStream> temp = new HashMap<>();

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipName))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int count;
                while ((count = zipInputStream.read(buffer)) != -1) {
                    byteArrayOutputStream.write(buffer, 0, count);
                    temp.put(zipEntry.getName(), byteArrayOutputStream);
                }
            }

            try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipName))) {
                for (Map.Entry<String, ByteArrayOutputStream> pair : temp.entrySet()) {
                    if (pair.getKey().substring(pair.getKey().lastIndexOf("/") + 1).equals(file.getName())) continue;
                    zipOutputStream.putNextEntry(new ZipEntry(pair.getKey()));
                    zipOutputStream.write(pair.getValue().toByteArray());
                }

                ZipEntry newFolder = new ZipEntry("new/" + file.getName());
                zipOutputStream.putNextEntry(newFolder);
                Files.copy(file.toPath(), zipOutputStream);
            }
        }
    }
}
