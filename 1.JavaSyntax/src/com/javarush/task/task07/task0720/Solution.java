package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        //напишите тут ваш код
        for (int i = 0; i < N; i++) {
            list.add(i, reader.readLine());
        }

        for (int i = 0; i < M; ) {
            list.add(list.get(0));
            list.remove(0);
            i++;
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
