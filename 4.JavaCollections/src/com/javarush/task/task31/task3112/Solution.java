package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("C:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL uri = new URL(urlString);
        InputStream inputStream = uri.openStream();

        Path tempFile = Files.createTempFile("temp-" + urlString.hashCode(), ".tmp");
        Files.copy(inputStream, tempFile);
        inputStream.close();
        String fileName = urlString.substring(urlString.lastIndexOf('/') + 1);
        Path downloadedFile = Paths.get(downloadDirectory.toString(), fileName);
        Files.move(tempFile, downloadedFile);

        return downloadedFile;
    }
}
