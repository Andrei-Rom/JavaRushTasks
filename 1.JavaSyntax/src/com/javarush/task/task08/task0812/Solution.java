package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int n = 1;
        int max;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) { //заполнение списка
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) n++;
            else n = 1;
            list1.add(n);
        }
        max = list1.get(0);
        for (int j = 1; j < list1.size(); j++) {
            if (list1.get(j) > max)
                max = list1.get(j);
        }
        System.out.println(max);
        for (Integer num : list1)
        {
            System.out.println(num);
        }

    }


}
