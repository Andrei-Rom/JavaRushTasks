package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> twoAndThree = new ArrayList<Integer>();


        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
            if (x % 3 == 0) three.add(x);
            if (x % 2 == 0) two.add(x);
            if (x % 2 != 0 && x % 3 != 0) twoAndThree.add(x);
        }

        printList(three);
        printList(two);
        printList(twoAndThree);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list)   //быстрый for по всем элементам, только для коллекций
        {
            System.out.println(x);
        }
    }
}
