package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new FileReader(args[0]));
    HashMap<String, Double> salaries = new HashMap<>();

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

        Double maxSalary = 0.0;
        for (Map.Entry entry : salaries.entrySet()){
        if ((double)entry.getValue() > maxSalary) maxSalary = (double)entry.getValue();
    }
        for (Map.Entry entry : salaries.entrySet()){
            if ((double)entry.getValue() == maxSalary) System.out.println(entry.getKey());
        }
    }
}



