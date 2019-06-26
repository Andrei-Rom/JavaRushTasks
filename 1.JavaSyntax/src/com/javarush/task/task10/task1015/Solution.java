package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] array = new ArrayList[2];
        ArrayList<String> strings0 = new ArrayList<>();
        strings0.add("0strings0");
        strings0.add("1strings0");
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("0strings1");
        strings1.add("1strings1");
        array[0] = strings0;
        array[1] = strings1;

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}