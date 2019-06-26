package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine(), true);
        FileInputStream inputStream2  = new FileInputStream(reader.readLine());
        FileInputStream inputStream3  = new FileInputStream(reader.readLine());
        byte[] buffer2 = new byte[inputStream2.available()];
        byte[] buffer3 = new byte[inputStream3.available()];
        int count2 = 0;
        int count3 = 0;

        while (inputStream2.available() > 0)
        {
            count2 = inputStream2.read(buffer2);
        }
        while (inputStream3.available() > 0)
        {
            count3 = inputStream3.read(buffer3);
        }
        inputStream2.close();
        inputStream3.close();


        outputStream1.write(buffer2, 0, count2);
        outputStream1.write(buffer3, 0 , count3);

        outputStream1.close();

    }
}
