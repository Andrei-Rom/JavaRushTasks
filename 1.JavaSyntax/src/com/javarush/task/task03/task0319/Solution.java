package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sCount = reader.readLine();
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);
        int count = Integer.parseInt(sCount);


        System.out.println(name + " получает " + count + " через " + age + " лет. ");
    }
}
