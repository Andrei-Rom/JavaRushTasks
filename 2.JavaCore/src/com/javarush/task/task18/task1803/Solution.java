package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Самые частые байты
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

        int indexMax = 0;
        for (int i = 1; i < byteArray.length; i++) {
            int valueMax = byteArray[0];
            if (byteArray[i] > valueMax) indexMax = i;
        }
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] == byteArray[indexMax]) System.out.print(i + " ");
        }
        fis.close();
    }
}
