package com.javarush.task.task14.task1420;

/* 
НОД
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if(a <= 0) throw new Exception();
        if(b <= 0) throw new Exception();
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        System.out.println(a);
    }
}
