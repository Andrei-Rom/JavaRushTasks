package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int i = 0;
        double avverege = 0.00000;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1)
                break;
            else sum = sum + number;
            i++;
            avverege = sum / i;

        }
        System.out.println(avverege);
    }

}

