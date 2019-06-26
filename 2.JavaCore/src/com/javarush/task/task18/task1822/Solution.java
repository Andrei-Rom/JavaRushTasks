package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader buffredReader = new BufferedReader(new FileReader(reader.readLine()));
        String s = null;
        while ((s = buffredReader.readLine()) != null)
        {
            if (s.startsWith(args[0] + " ")) System.out.println(s);
        }


        buffredReader.close();
    }
}
