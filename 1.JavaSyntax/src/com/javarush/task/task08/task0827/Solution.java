package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {


        Date yearDate = new Date(date);
        Date startTime = new Date(date);
        startTime.setDate(1);
        startTime.setMonth(0);

        long msTimeDistance = yearDate.getTime() - startTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance / msDay);

        return (dayCount % 2 == 0);
    }
}
