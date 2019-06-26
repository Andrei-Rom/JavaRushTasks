package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone10", df.parse("JUNE 1 1980"));
        map.put("Stallone1", df.parse("JULY 1 1980"));
        map.put("Stallone2", df.parse("JUNE 1 1980"));
        map.put("Stallone3", df.parse("JUNE 1 1980"));
        map.put("Stallone4", df.parse("SEPTEMBER 1 1980"));
        map.put("Stallone5", df.parse("JUNE 1 1980"));
        map.put("Stallone6", df.parse("JUNE 1 1980"));
        map.put("Stallone7", df.parse("MAY 1 1980"));
        map.put("Stallone8", df.parse("JUNE 1 1980"));
        map.put("Stallone9", df.parse("APRIL 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        for (HashMap.Entry<String, Date> entry : map.entrySet()) {
           // Date value = entry.getValue();
           // int month = value.getMonth();
           // if (month >4 && month <8)                  //значение
           // map.remove(entry.getKey());
           // map.values().removeIf(s -> s.getMonth() >= 5 && s.getMonth() <= 8);
            map.entrySet().removeIf(pair -> pair.getValue().getMonth() > 4 & pair.getValue().getMonth() < 8);

        }

    }

    public static void main(String[] args) /*throws ParseException */{
       /* HashMap<String, Date> map = createMap();

        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Date value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }

        */
    }
}
