package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":{
                if (args[2].equals("м")) allPeople.add(Person.createMale(args[1], format2.parse(args[3])));
                if (args[2].equals("ж")) allPeople.add(Person.createFemale(args[1], format2.parse(args[3])));
                System.out.println(allPeople.size()-1);
            }
                break;
            case "-u":{
                int id = Integer.parseInt(args[1]);
                if (id>=0 && id<allPeople.size())
                {
                allPeople.get(id).setName(args[2]);
                allPeople.get(id).setSex(args[3].equals("м")?Sex.MALE:Sex.FEMALE);
                allPeople.get(id).setBirthDate(format2.parse(args[4]));
                }
            }
                break;
            case "-d":{
                int id=Integer.parseInt(args[1]);
                if (id>=0 && id<allPeople.size()){
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDate(null);

                }
            }
                break;
            case "-i": {
                Person men = allPeople.get(Integer.parseInt(args[1]));
                char s;
                if (men.getSex() == Sex.MALE) s = 'м';
                else s = 'ж';
                System.out.println(men.getName() + " " + s + " " + format1.format((men.getBirthDate())));
            }
                break;
        }
       }
}
