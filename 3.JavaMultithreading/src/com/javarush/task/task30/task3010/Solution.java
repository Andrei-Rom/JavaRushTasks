package com.javarush.task.task30.task3010;

/* 
Минимальное допустимое основание системы счисления
*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            for (int i = 2; i <= 36; i++) {
                if (isNumber(args[0], i)) {
                    System.out.println(i);
                    break;
                }
                else {
                    if (i == 36) {
                        System.out.println("incorrect");
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public static boolean isNumber(String string, int radix) {
        boolean result = false;
        try {
            new BigDecimal(new BigInteger(string, radix));
            result = true;
        } catch (Exception e) {
        }
        return result;
    }
}