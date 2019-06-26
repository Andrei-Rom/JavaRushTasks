package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);
            if (year%400==0)
                a = 366;
            else if (year%100==0)
                a=365;
            else if (year%4==0)
                a=366;
            else
                a=365;

        System.out.println("количество дней в году: "+ a);
    }
}