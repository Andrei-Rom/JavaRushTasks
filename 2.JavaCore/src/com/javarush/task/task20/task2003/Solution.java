package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        load(fis);
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties fileProperties = new Properties();
        fileProperties.putAll(properties);
        fileProperties.store(outputStream, "Сохраненный файл");

    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties fileProperties = new Properties();
        fileProperties.load(inputStream);
        fileProperties.forEach((key, value) -> properties.put(key.toString(), value.toString()));
    }

    public static void main(String[] args) {

    }
}
