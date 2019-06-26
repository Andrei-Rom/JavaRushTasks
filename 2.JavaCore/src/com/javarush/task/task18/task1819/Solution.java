package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileOutputStream outputStream1 = new FileOutputStream(fileName1);
        FileInputStream inputStream1  = new FileInputStream(fileName1);
        FileInputStream inputStream2  = new FileInputStream(fileName2);

        byte[] buffer1 = new byte[inputStream1.available()];
        byte[] buffer2 = new byte[inputStream2.available()];
        int count1 = 0;
        int count2 = 0;

        while (inputStream1.available() > 0)
        {
            count1 = inputStream1.read(buffer1);
        }
        while (inputStream2.available() > 0)
        {
            count2 = inputStream2.read(buffer2);
        }
        inputStream1.close();
        inputStream2.close();


        outputStream1.write(buffer2, 0, count2);
        outputStream1.write(buffer1, 0 , count1);

        outputStream1.close();

    }
}