package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        //...
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {fileName = reader.readLine();} catch (IOException e){ e.printStackTrace();}

        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] words = content.split(" ");


        StringBuilder result = getLine(words);
        System.out.println(result.toString());

    }


    public static StringBuilder getLine(String... words) {
          return null;
    }
}
