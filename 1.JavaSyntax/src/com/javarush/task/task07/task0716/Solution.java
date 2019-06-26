package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list.add("мера"); // 3
        list.add("вода"); // 4
        list.add("упор"); // 5

        list = fix(list);


        for (String s : list) {
            System.out.println(s);
        }
    }
    public static String rOrL (String s){
        int length = s.length();
        int r = 0;
        int l= 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'р') r++;
            if (s.charAt(i) == 'л') l++;
        }
        if (r > 0 && l > 0) return "save";
        else if (r > 0) return "delete";
        else if (l > 0) return "multiply";
        else return "save";
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); ) {
            if ((rOrL(list.get(i))).equals("delete")) list.remove(list.get(i));
            else if ((rOrL(list.get(i))).equals("multiply")){
                int j = i;
                list.add(j, list.get(i));
                i = i + 2;
            }
            else
                i++;
        }
        return list;
    }
}
