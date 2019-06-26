package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        int lengthA = sA.length();
        int lengthB = sB.length();

        if (sA.equals(sB))
        System.out.println("Имена идентичны");
        else if (lengthA == lengthB)
        System.out.print("Длины имен равны");
    }
}
