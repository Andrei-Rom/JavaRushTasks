package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String vowelsOut = "";
        String otherOut = "";
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; ) {
            char s = ' ';
            if (s == (array[i])) i++;
            else if (isVowel(array[i])) {
                vowelsOut = vowelsOut + array[i] + s;
                i++;
            }
            else {
                otherOut = otherOut + array[i] + s;
                i++;
            }
        }
        System.out.println(vowelsOut);
        System.out.println(otherOut);


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}