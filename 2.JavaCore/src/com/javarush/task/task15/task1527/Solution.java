package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
//        String key = args[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = "";
        try {
            key = reader.readLine();
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
        String substringKey = key.substring(key.indexOf("?") + 1);
        String[] arrayOfSubstringKey = substringKey.split("&");
        for (String a : arrayOfSubstringKey) {
            System.out.print(a.split("=")[0] + " ");
        }
        System.out.println();
        for (String a : arrayOfSubstringKey) {
            try {
                if (a.split("=")[0].equals("obj")) {
                    alert(Double.parseDouble(a.split("=")[1]));
                }
            } catch (Exception e) {
                alert(a.split("=")[1]);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
