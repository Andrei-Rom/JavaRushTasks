package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if (args.length==0) return;
        switch (args[0]) {
            case "-c":{
                synchronized (allPeople) {
                int i = 1;
                while (i < args.length) {
                    if (args[i + 1].equals("м")) allPeople.add(Person.createMale(args[i], format2.parse(args[i + 2])));
                    if (args[i + 1].equals("ж")) allPeople.add(Person.createFemale(args[i], format2.parse(args[i + 2])));
                    System.out.println(allPeople.size()-1);
                    i = i + 3;
                }
                }
            }
            break;
            case "-u":{
                synchronized (allPeople) {
                int i = 1;
                while (i < args.length) {
                    int id = Integer.parseInt(args[i]);
                    if (id>=0 && id<allPeople.size())
                    {
                        allPeople.get(id).setName(args[i + 1]);
                        allPeople.get(id).setSex(args[i + 2].equals("м")?Sex.MALE:Sex.FEMALE);
                        allPeople.get(id).setBirthDate(format2.parse(args[i + 3]));
                    }
                    i = i + 4;
                }
                }
            }
            break;
            case "-d":{
                synchronized (allPeople) {
                for (int i = 1; i < args.length; i++) {
                    int id = Integer.parseInt(args[i]);
                    if (id >= 0 && id < allPeople.size()) {
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }
                }
                }
            }
            break;
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person men = allPeople.get(Integer.parseInt(args[i]));
                        char s;
                        if (men.getSex() == Sex.MALE) s = 'м';
                        else s = 'ж';
                        System.out.println(men.getName() + " " + s + " " + format1.format((men.getBirthDate())));
                    }
                }
            }
            break;
        }
    }
}