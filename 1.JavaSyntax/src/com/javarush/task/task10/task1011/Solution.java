package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        System.out.println(s);
        for (int i = 1; i < 40; i++) {
            int leight = s.length();
            String m = s.substring(i, leight);
            System.out.println(m);
        }
    }

}

