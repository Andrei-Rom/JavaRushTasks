package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int[] charArray  = new int[256];

        while(inputStream.available() > 0){
            charArray[inputStream.read()]++;
        }

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 0) System.out.println((char) i + " " + charArray[i]);
        }
        inputStream.close();

    }
}
