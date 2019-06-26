package com.javarush.task.task19.task1914;

/*
Решаем пример
*/

        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);
        System.setOut(myStream);
        testString.printSomething();
        String inputString = outputStream.toString();
        String[] inputArr = inputString.split(" ");
        int a = Integer.parseInt(inputArr[0]);
        String digit = inputArr[1];
        int b = Integer.parseInt(inputArr[2]);
        int c = 0;
        switch (inputArr[1]) {
            case "+": { c = a + b; } break;
            case "-": { c = a - b; } break;
            case "*": { c = a * b; } break;
        }
        System.setOut(consoleStream);
        System.out.println(a + " " + digit + " " + b + " = " + c);
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

