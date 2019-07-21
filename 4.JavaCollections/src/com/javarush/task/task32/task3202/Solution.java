package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter stringWriter = new StringWriter();
        if (is == null) return stringWriter;
        else {
            while (is.available() > 0) {
                byte[] buff = new byte[1000];
                int len = is.read(buff);
                String temp = new String(buff, 0 , len);
                stringWriter.append(temp);
            }
            return stringWriter;
        }
    }
}