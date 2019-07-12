package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите полный путь архива:");
            String FullArchiveName = reader.readLine();
            System.out.println("Введите путь к файлу, который будем архивировать");
            String FullFileName = reader.readLine();
            reader.close();
            ZipFileManager zipFileManager = new ZipFileManager(Paths.get(FullArchiveName));
            zipFileManager.createZip(Paths.get(FullFileName));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
