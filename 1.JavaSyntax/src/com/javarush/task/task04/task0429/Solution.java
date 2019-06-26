package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 3;
        int countPos = 0;
        int countNeg = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(reader.readLine());
            if (n > 0)
                countPos++;
            if (n < 0)
                countNeg++;
        }
        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);

    }
}
