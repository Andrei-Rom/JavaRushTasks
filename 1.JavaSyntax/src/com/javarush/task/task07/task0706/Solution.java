package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int civilOdd =0;
        int civilEven =0;
        int[] numbers = new int[15];
        for (int i = 0; i < 15; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 15; i++) {
            if (i == 0 || i % 2 == 0) civilEven = civilEven +numbers[i];
            else civilOdd = civilOdd + numbers[i];
        }
        String s = (civilEven < civilOdd) ? "В домах с нечетными номерами проживает больше жителей." : "В домах с четными номерами проживает больше жителей.";
        System.out.println(s);
    }
}
