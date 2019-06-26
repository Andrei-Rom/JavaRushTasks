package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int s,m,l;
        if (a>b && a>c) {
            l = a;
            if (b>c) {
                m = b;
                s = c;
            }
            else {
                m = c;
                s=b;
            }
        }
        else if (b>c ) {
            l = b;
            if (a>c) {
            m = a;
            s = c;
            }
            else {
            m = c;
            s = a;
        }
    }
        else {
            l=c;
            if (a>b){
                m=a;
                s=b;
            }
            else {
                m = b;
                s = a;
            }
            }

        System.out.println(l + " " + m + " " + s);
    }
}
