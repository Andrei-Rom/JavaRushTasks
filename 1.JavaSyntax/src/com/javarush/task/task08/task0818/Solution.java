package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Sim", 1000);
        map.put("Tom", 100);
        map.put("Arbus", 200);
        map.put("Baby", 300);
        map.put("Cat", 400);
        map.put("Dog", 600);
        map.put("Eat", 700);
        map.put("Food", 800);
        map.put("Gevey", 900);
        map.put("Hugs", 3000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
/*      HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Integer  value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
*/
    }
}