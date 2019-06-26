package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileFeader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder builder = new StringBuilder();
        String input;
        while ((input = fileFeader.readLine()) != null) {
            String[] inputArr = input.split(" ");
            for (String s : inputArr){
                if (s.length() > 6) builder.append(s).append(',');
            }
        }
        fileWriter.write(builder.substring(0, builder.length() - 1));
        fileFeader.close();
        fileWriter.close();
    }
}
