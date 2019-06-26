package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> months = new ArrayList<String>(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        int m = 0;
        for ( int i = 0; i < months.size(); i++)
        {
            if ( months.get(i).equals(month))
            {
                m = i;
                break;
            }
        }
        System.out.print(month + " is the " + (m + 1) + " month");
    }
}
