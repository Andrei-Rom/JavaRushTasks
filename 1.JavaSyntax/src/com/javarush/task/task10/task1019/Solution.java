package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, id);
                if (name.isEmpty()) break;
            }
            catch (NumberFormatException e){
                break;
            }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Object value = pair.getValue();                  //значение
            System.out.println(value + " " + key);
        }

    }
}
