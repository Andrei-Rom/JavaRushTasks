package com.javarush.task.task05.task0528;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat formatter= new SimpleDateFormat("dd MM yyyy");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));

    }

}

