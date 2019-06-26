package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int house;
        private int age;
        private int zip;
        private String name;
        private String sity;
        private boolean sex;

        public Human(int age, int zip, String name, String sity, boolean sex){
            this.age = age;
            this.zip = zip;
            this.name = name;
            this.sity = sity;
            this.sex = sex;
        }

        public Human(int zip, String name, String sity, boolean sex){
            this.zip = zip;
            this.name = name;
            this.sity = sity;
            this.sex = sex;
        }
        public Human(String name, String sity, boolean sex){
            this.name = name;
            this.sity = sity;
            this.sex = sex;
        }
        public Human(String sity, boolean sex){
            this.name = name;
            this.sity = sity;
            this.sex = sex;
        }
        public Human(boolean sex){
            this.sex = sex;
        }
        public Human(int house, int age, int zip, String name){
            this.house = house;
            this.age = age;
            this.zip = zip;
            this.name = name;
        }
        public Human(int house, int age, int zip){
            this.house = house;
            this.age = age;
            this.zip = zip;
        }
        public Human(int house, int age){
            this.house = house;
            this.age = age;
        }
        public Human(int house, int age, String name){
            this.house = house;
            this.age = age;
            this.name = name;
        }
        public Human(int house, int age, int zip, String name, String sity, boolean sex){
            this.house = house;
            this.age = age;
            this.zip = zip;
            this.name = name;
            this.sity = sity;
            this.sex = sex;
        }
    }
}
