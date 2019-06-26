package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // напишите тут ваш код
        ArrayList<Integer> count = new ArrayList<>(); // создаем список чисел
        for (int i = 0; i < 33; i++) {
            count.add(i, 0); //заполняем нулями
        }

        for (int i = 0; i < 10; i++) {  //проверяем каждое слово из массива по отдельности
            char[] word = list.get(i).toCharArray(); //Строка=>массив симоволов
            for (char c : word) { //проверка каждого символа по отдельности
                for (int k = 0; k < alphabet.size(); k++) {
                    int n = count.get(k); // получаем текущее количество
                    if (c == alphabet.get(k)) {
                        n = n + 1; // увеличиваем количество на единицу
                        count.set(k, n);
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + count.get(i)); // выводим "двухмерный" массив
        }
    }

}
