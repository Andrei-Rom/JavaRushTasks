package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
             FileWriter fileWriter = new FileWriter(reader.readLine())) {
            int tempByte;
            int count = 0;
            while ((tempByte = fileReader.read()) != -1) {
                if (++count % 2 == 0) {
                    fileWriter.write(tempByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}