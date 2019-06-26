package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("Name", new Cat("Name"));
        map.put("Name1", new Cat("Name"));
        map.put("Name2", new Cat("Name"));
        map.put("Name3", new Cat("Name"));
        map.put("Name4", new Cat("Name"));
        map.put("Name5", new Cat("Name"));
        map.put("Name6", new Cat("Name"));
        map.put("Name7", new Cat("Name"));
        map.put("Name8", new Cat("Name"));
        map.put("Name9", new Cat("Name"));


        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            cats.add(pair.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
