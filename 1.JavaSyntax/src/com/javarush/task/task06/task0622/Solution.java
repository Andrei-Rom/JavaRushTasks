package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int array[]=new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        //напишите тут ваш код
    }
}
