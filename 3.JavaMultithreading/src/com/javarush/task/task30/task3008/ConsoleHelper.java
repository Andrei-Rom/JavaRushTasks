package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String message;
    static int integer;

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() {
        try {
            message = reader.readLine();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            readString();
        }
        return message;
    }

    public static int readInt() {
        try {
            integer = Integer.parseInt(readString());
        } catch (NumberFormatException e) {
            System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            readInt();
        }

        return integer;
    }
}
