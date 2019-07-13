package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String resultFileName = args[0];
        List<String> parts = new ArrayList<>();
        List<FileInputStream> inputStreams = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            parts.add(args[i]);
        }
        parts.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String part : parts) {
            inputStreams.add(new FileInputStream(part));
        }

        try (SequenceInputStream sequenceInputStream = new SequenceInputStream(Collections.enumeration(inputStreams));
             ZipInputStream zipInputStream = new ZipInputStream(sequenceInputStream);
             FileOutputStream fileOutputStream = new FileOutputStream(resultFileName)) {
            byte[] buffer = new byte[1024];
            while (zipInputStream.getNextEntry() != null) {
                int count;
                while ((count = zipInputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, count);
                }
            }
        }

    }
}
