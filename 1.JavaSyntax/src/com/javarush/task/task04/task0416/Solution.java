package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sT = reader.readLine();
        double t = Double.parseDouble(sT);
        t = t%5;
        if (t>=0 && t<3)
        System.out.println("зелёный");
        if (t>=3 && t<4)
        System.out.println("жёлтый");
        if (t>=4 && t<5)
        System.out.println("красный");
    }
}