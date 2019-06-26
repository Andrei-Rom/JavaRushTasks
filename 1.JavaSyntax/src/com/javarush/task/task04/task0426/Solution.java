package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String evenOdd = (a % 2 == 0) ? "четное число" : "нечетное число";
        String positiveNegative = (a > 0) ? "положительное" : "отрицательное";
        if (a == 0)
            System.out.println("ноль");
        else
            System.out.println(positiveNegative + " " + evenOdd);
        /*
        System.out.println((a<0 && a%2==0)? "отрицательное четное число" :(a<0 && a%2!=0)?
                "отрицательное нечетное число": (a==0)? "ноль": (a>0 && a%2==0)?
                "положительное четное число": (a>0 && a%2!=0)? "положительное нечетное число": null);

        */

    }
}
