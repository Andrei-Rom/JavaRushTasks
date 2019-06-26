package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName1 = reader.readLine();
            FileInputStream inputStream1  = new FileInputStream(fileName1);
            byte[] buffer = new byte[inputStream1.available()];
            int count = inputStream1.read(buffer);
            if (count < 1000) {
                inputStream1.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
