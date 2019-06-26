package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human hum1 = new Human("hum1",true,55);
        Human hum2 = new Human("hum1",true,55);
        Human hum3 = new Human("hum1",true,55);
        Human hum4 = new Human("hum1",true,55);
        Human hum5 = new Human("hum1",true,55, hum1, hum2);
        Human hum6 = new Human("hum1",true,55, hum3, hum4);
        Human hum7 = new Human("hum1",true,55, hum1, hum3);
        Human hum8 = new Human("hum1",true,55, hum3, hum2);
        Human hum9 = new Human("hum1",true,55, hum4, hum2);

        System.out.println(hum1);
        System.out.println(hum2);
        System.out.println(hum3);
        System.out.println(hum4);
        System.out.println(hum5);
        System.out.println(hum6);
        System.out.println(hum7);
        System.out.println(hum8);
        System.out.println(hum9);


    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}