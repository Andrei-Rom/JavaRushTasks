package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {

    public static Cat cat;
    static {
        String name = "Barsik";
        cat = new Cat();
        cat.name = name;
        System.out.println(cat.name);
    }
    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }

}
