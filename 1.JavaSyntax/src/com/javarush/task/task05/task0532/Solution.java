package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int maximum = Integer.MIN_VALUE;
        int N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                int b = Integer.parseInt(reader.readLine());
                if (b > maximum)
                    maximum = b;
            }
            System.out.println(maximum);
        }
    }
}
