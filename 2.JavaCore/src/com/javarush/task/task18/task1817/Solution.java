package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream  = new FileInputStream(args[0]);
        int space = 0;
        int chars = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == 32) {
                space++;
                chars++;
            }
            else chars++;
        }
        inputStream.close();
        System.out.println(String.format("%.2f", (float)space/chars*100.0));
    }
}
