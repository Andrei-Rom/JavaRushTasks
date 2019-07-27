package com.javarush.task.task36.task3605;

import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/* 
Использование TreeSet
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<Character> characters = new TreeSet<>();
        FileReader fileReader = new FileReader(args[0]);
        int n;
        while ((n = fileReader.read()) != -1) {
            if (Character.isLetter((char) n)) {
                characters.add((char) n);
            }
        }
        Character character;
        for (int i = 0; i < 5; i++) {
            character = characters.pollFirst();
            if (character != null)
                System.out.print(character);
        }
    }
}