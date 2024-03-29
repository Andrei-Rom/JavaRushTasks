package com.javarush.task.task39.task3910;

/* 
isPowerOfThree
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(242));
        System.out.println(isPowerOfThree(243));
        System.out.println(isPowerOfThree(244));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while ((n % 3) == 0) {
            n = n / 3;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }
}
