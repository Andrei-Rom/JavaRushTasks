package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String evenOdd = (a % 2 == 0) ? "четное" : "нечетное";
        int b = a/10;
        String desimal = null;
        if (a >=1 && a<=999) {
            if (b < 1)
                desimal = "однозначное";
            if  (b >=1 && b <10)
                desimal = "двузначное";
            if (b>=10 && b<100)
                desimal = "трехзначное";
        }
        System.out.println(evenOdd + " " + desimal + " " + "число");
    }
}
