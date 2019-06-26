package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();


    static{
        labels.put(1.2, "ZOZO");
        labels.put(1.3, "MOMO");
        labels.put(1.4, "NONO");
        labels.put(1.5, "JOJO");
        labels.put(1.6, "KOKO");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }


}
