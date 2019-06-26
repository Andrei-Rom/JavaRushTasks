package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream inputStream1  = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);

        byte[] buffer = new byte[inputStream1.available()];
        while (inputStream1.available() > 0) {
            int count = inputStream1.read(buffer);
            int j;
            byte temp;
            for (int i = 0; i < count/2; i++) {
                j = count - 1 - i;
                temp = buffer[i];
                buffer[i] = buffer[j];
                buffer[j] = temp;
            }
            outputStream2.write(buffer, 0, count);
        }
        inputStream1.close();
        outputStream2.close();
    }
}
