package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = (reader.readLine());
        int length = sN.length();
        for (int i = 0; i < length; i++) {
           if (sN.charAt(i)%2==0) even++;
           else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
