package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int winThis = 0;
        int winAnother = 0;
        if (this.age > anotherCat.age)
            winThis++;
        else if (this.age < anotherCat.age)
            winAnother++;
        if (this.weight > anotherCat.weight)
            winThis++;
        else if (this.weight < anotherCat.weight)
            winAnother++;
        if (this.strength > anotherCat.strength)
            winThis++;
        else if (this.strength < anotherCat.strength)
            winAnother++;
        if (winThis > winAnother) return true;
        else return false;
        

    }

    public static void main(String[] args) {


    }
}
