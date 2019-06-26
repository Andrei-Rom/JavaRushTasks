package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileFeader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String input;
        while ((input = fileFeader.readLine()) != null) {
            char[] inputArr = input.toCharArray();
            char temp;
            for (int i = 0; i < inputArr.length/2; i++) {
                int j = inputArr.length - 1 - i;
                temp = inputArr[i];
                inputArr[i] = inputArr[j];
                inputArr[j] = temp;
            }
            String output = new String(inputArr);
            System.out.println(output);


        }
        fileFeader.close();
    }
}