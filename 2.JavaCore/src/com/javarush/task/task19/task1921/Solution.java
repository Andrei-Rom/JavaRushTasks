package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        Pattern pattern = Pattern.compile("^(\\D+)\\s(\\d+\\s\\d+\\s\\d+)");
        SimpleDateFormat datePattern = new SimpleDateFormat("dd MM yyyy");

        String str;
        while ((str = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()){
                PEOPLE.add(new Person(matcher.group(1), datePattern.parse(matcher.group(2))));
            }
        }
        reader.close();
    }
}