package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = "";
        ArrayList<String> list = new ArrayList<>();
        try {
            while (!filename.equals("end")) {
                filename = reader.readLine();
                list.add(filename);
            }
        } catch (IOException e) {
        }
        Collections.sort(list);
        filename = list.get(0).substring(0, list.get(0).lastIndexOf("."));
        int byteBuffer;
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filename))) {
            for (String s : list) {
                try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(s))) {
                    while ((byteBuffer = inputStream.read()) != -1) {
                        outputStream.write(byteBuffer);
                    }
                } catch (IOException e) {
                }
            }

        } catch (IOException e) {
        }
    }
}