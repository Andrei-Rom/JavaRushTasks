package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        HashMap <String, Double> salaries = new HashMap<>();

        String input;
        while ((input = reader.readLine()) != null) {
            String[] inputArr = input.split(" ");
            String keyName = inputArr[0];
            Double valueSalary = Double.parseDouble(inputArr[1]);

            if (salaries.containsKey(keyName)) {
                Double value = salaries.get(keyName);
                salaries.replace(keyName, value, value + valueSalary);
            }
            else salaries.put(keyName, valueSalary);
        }
        reader.close();

        TreeSet<String> salariesSet = new TreeSet<>();
        for (Map.Entry entry : salaries.entrySet()){
            salariesSet.add(entry.getKey() + " " + entry.getValue());
        }

        for (String s : salariesSet){
            System.out.println(s);
        }
    }
}
