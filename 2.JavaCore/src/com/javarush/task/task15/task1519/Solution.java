package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        String o;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!((o = reader.readLine()).equals("exit"))) {
            try {
                int i = Integer.parseInt(o);
                if (i > 0 && i < 128) {
                    print((short) i);
                } else print(i);
            } catch (NumberFormatException e) {
                try {
                    print(Double.parseDouble(o));
                } catch (NumberFormatException ee) {
                    print(o);
                }
            }
        }
    }
        public static void print (Double value){
            System.out.println("Это тип Double, значение " + value);
        }

        public static void print (String value){
            System.out.println("Это тип String, значение " + value);
        }

        public static void print ( short value){
            System.out.println("Это тип short, значение " + value);
        }

        public static void print (Integer value){
            System.out.println("Это тип Integer, значение " + value);
        }
    }

