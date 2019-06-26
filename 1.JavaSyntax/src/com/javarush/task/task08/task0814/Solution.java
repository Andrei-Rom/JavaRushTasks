package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        while (set.size()<20)
            set.add(set.size() + 1);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        set.removeIf(element -> element > 10);
        return set;


    }

    public static void main(String[] args) {
        /*
        HashSet<Integer> set = createSet();
        for(Integer numb : set){
            System.out.println(numb);
        }
        set = removeAllNumbersGreaterThan10(set);
        for(Integer numb : set){
            System.out.println(numb);
        }

         */
    }
}
