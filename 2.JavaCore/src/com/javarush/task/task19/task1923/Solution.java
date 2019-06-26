package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileFeader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

        String input;
        while ((input = fileFeader.readLine()) != null) {
            String[] inputArr = input.split(" ");
            for (String s : inputArr){
                if (!s.replaceAll("\\d","").equals(s)) fileWriter.write(s + " ");
            }
        }
        fileFeader.close();
        fileWriter.close();
    }
}
