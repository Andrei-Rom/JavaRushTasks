package com.javarush.task.task08.task0824;

/*
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> people = new ArrayList<>();
        Human child3 = new Human("child3", true, 10);
        Human child2 = new Human("child2", true, 10);
        Human child1 = new Human("child1", true, 10);
        Human mom = new Human("mom", true, 30);
        Human dad = new Human("dad", true, 30);
        Human gdad = new Human("gdad", true, 70);
        Human gdad1 = new Human("gdad1", true, 70);
        Human gmom = new Human("gmom", true, 70);
        Human gmom1 = new Human("gmom1", true, 70);
        dad.children.add(child1);
        dad.children.add(child2);
        dad.children.add(child3);
        mom.children.add(child1);
        mom.children.add(child2);
        mom.children.add(child3);
        gdad.children.add(dad);
        gdad1.children.add(mom);
        gmom.children.add(dad);
        gmom1.children.add(mom);
        people.add(child1);
        people.add(child2);
        people.add(child3);
        people.add(dad);
        people.add(mom);
        people.add(gdad);
        people.add(gdad1);
        people.add(gmom);
        people.add(gmom1);
        for (Human human : people)
            System.out.println(human.toString());//напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();//напишите тут ваш код

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}