package com.javarush.task.task14.task1419;

import javax.swing.tree.ExpandVetoException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception

        exceptions.add(new NoSuchFieldException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ClassCastException());
        exceptions.add(new FileNotFoundException());
    }
}
