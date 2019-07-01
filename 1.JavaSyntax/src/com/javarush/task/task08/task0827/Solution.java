package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {


        Date yearDate = new Date(date);

        //SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        //Date yearDate = format.parse(date);
        //System.out.println(yearDate);

        Date startTime = new Date(date);
        startTime.setDate(1);
        startTime.setMonth(0);

        long msTimeDistance = yearDate.getTime() - startTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance / msDay);

        return (dayCount % 2 == 0);
    }
}
