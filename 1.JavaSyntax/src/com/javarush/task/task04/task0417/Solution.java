package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
            if ((a==b && b==c))
                System.out.println(a + " " + a+ " " + a);
            else if ((b==c))
                System.out.println(c + " " + c);
            else  if ((a==b || a==c))
                System.out.println(a + " " + a);
    }
}