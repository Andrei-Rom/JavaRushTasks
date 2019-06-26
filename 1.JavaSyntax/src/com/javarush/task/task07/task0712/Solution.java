package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine());
        }
        int minLeight = list.get(0).length();
        int maxLeight = 0;
        for (int i = 0; i < 10; i++) {
            if (minLeight > list.get(i).length())
                minLeight = list.get(i).length();
            if (maxLeight < list.get(i).length())
                maxLeight = list.get(i).length();
        }
        int minIndex = 50;
        for (int i = 0; i < 10; i++) {
            if (maxLeight == list.get(i).length() || minLeight == list.get(i).length()) {
                if (i < minIndex) {
                    minIndex = i;
                    System.out.println(list.get(i));
                }
            }
        }

    }
}
