package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buffredReader = new BufferedReader(new FileReader(reader.readLine()));
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();

        String s = null;
        ArrayList<Long> values = new ArrayList<Long>();
        while ((s = buffredReader.readLine()) != null)
        {
            for (String retval : s.split(" ")) {
                double d = Double.parseDouble(retval);
                values.add(Math.round(d));
            }
        }
        buffredReader.close();

        for (Long value : values)
            fileWriter.write( value.toString()+" ");


        fileWriter.close();

    }
}
