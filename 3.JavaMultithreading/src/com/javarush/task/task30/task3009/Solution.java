package com.javarush.task.task30.task3009;

import java.util.HashSet;
import java.util.Set;

/* 
Палиндром?
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }
    private static Set<Integer> getRadix (String number) {
        Set<Integer> set = new HashSet<>();
            if (isNumeric(number)){
            for (int i = 2; i <= 36; i++) {
                String numberInRadix = Integer.toString(Integer.parseInt(number), i) + "";
                if (isPalindrome(numberInRadix)) {
                    set.add(i);
                }
            }
        }
        return set;
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric(String strNum) {
        try {
            int tmp = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}