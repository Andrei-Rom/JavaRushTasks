package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        Date spa = sp.parse(r.readLine());
        SimpleDateFormat et = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(et.format(spa).toUpperCase());
    }
}
