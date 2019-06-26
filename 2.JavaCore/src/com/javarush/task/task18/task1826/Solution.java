package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[1]));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(args[2]));
        switch (args[0]) {
            case "-e": {
                byte[] buffer = new byte[inputStream.available()];
                int count = 0;
                byte temp;
                while (inputStream.available() > 0) {
                    count = inputStream.read(buffer);
                }
                inputStream.close();
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] = (byte) (buffer[i] + 1);
                }
                outputStream.write(buffer, 0, count);
                outputStream.close();
            }
            break;
            case "-d": {
                byte[] buffer = new byte[inputStream.available()];
                int count = 0;
                byte temp;
                while (inputStream.available() > 0) {
                    count = inputStream.read(buffer);
                }
                inputStream.close();
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] = (byte) (buffer[i] - 1);
                }
                outputStream.write(buffer, 0, count);
                outputStream.close();
            }
            break;

        }

    }
}
