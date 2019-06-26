package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        int[] Min1Numbers = new int[10];
        int[] Min2Numbers = new int[10];
        for (int i = 0; i < 20; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            Min1Numbers[i] = numbers [i];
            int j = 10 + i;
            Min2Numbers[i] = numbers[j];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Min2Numbers[i]);
        }
    }
}
