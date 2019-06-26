package com.javarush.task.task18.task1808;

/*
Разделение файла
*/

        import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream inputStream1  = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);
        FileOutputStream outputStream3 = new FileOutputStream(fileName3);
        byte[] buffer = new byte[inputStream1.available()];
        while (inputStream1.available() > 0)
        {
            int count = inputStream1.read(buffer);
            int off3 = count/2;
            int off2 = count - off3;

            outputStream2.write(buffer, 0, off2);
            outputStream3.write(buffer, off2, off3);
        }

        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}
