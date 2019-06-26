package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] byteArray  = new int[128];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        FileInputStream fis = new FileInputStream(str);

        while(fis.available() > 0){
            int x = fis.read();
            byteArray[x]++;
        }


        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] > 0) System.out.print(i + " ");
        }
        fis.close();
    }
}
