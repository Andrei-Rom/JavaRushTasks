package com.javarush.task.task37.task3714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Древний Рим
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }

    public static int romanToInteger(String s) {
        if (s == null) {
            return 0;
        }

        int length = s.length();
        int sum = 0;
        int pre = 0;

        for (int i = length - 1; i >= 0; i--) {
            int cur = romanTable(s.charAt(i));

            if (i == length - 1) {
                sum = sum + cur;
            } else {
                if (cur < pre) {
                    sum = sum - cur;
                } else {
                    sum = sum + cur;
                }
            }
            pre = cur;
        }

        return sum;
    }

    public static int romanTable(char c) {
        int num = 0;
        switch (c) {
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
        }
        return num;
    }
}
