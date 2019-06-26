package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream  = new FileInputStream(args[0]);
        int quantity = 0;
        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            inputStream.read(buffer);
        }
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] >= 65 && buffer[i] <= 90 || buffer[i] >= 97 && buffer[i] <= 122) quantity++;
        }
        inputStream.close();
        System.out.println(quantity);
        }
    }

