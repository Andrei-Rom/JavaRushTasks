package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileFeader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        String input;
        while ((input = fileFeader.readLine()) != null) {
            int count = 0;
            String[] inputArr = input.split(" ");

            for (String s : inputArr){
                if (words.contains(s)) count++;
                if (count > 2) break;
            }
            if (count == 2) System.out.println(input);
        }
        fileFeader.close();
    }
}
