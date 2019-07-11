package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));

    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty()) {
            throw new TooShortStringException();
        }
        String[] sResult = string.split(" ");
        if (sResult.length < 5) {
            throw new TooShortStringException();
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            result.append(sResult[i]);
            result.append(" ");
        }
        return result.toString().substring(0, result.length() - 1);
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
