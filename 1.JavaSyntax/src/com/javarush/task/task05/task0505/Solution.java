package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat Zozo = new Cat("Zozo",5,10,1000);
        Cat Bobo = new Cat("Bobo",4,8,800);
        Cat Nono = new Cat("Nono",3,6,500);
        System.out.println(Zozo.fight(Bobo));
        System.out.println(Zozo.fight(Nono));
        System.out.println(Bobo.fight(Nono));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2  ? true : false;
        }
    }
}
