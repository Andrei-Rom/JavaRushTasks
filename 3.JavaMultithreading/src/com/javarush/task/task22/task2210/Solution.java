package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer strings = new StringTokenizer(query, delimiter);
        String[] result = new String[strings.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = strings.nextToken();
        }
        return result;
    }
}
