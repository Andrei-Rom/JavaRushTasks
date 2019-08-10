package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/

import java.io.*;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        FileReader fileReader = new FileReader("test");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
    }

    public static void main(String[] args) {

    }
}
