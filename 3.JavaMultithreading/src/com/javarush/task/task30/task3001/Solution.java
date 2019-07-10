package com.javarush.task.task30.task3001;

import java.math.BigInteger;

/*
Конвертер систем счислений
*/
public class Solution {
    public static void main(String[] args) {
        Number number = new Number(NumberSystemType._10, "6");
        Number result = convertNumberToOtherNumberSystem(number, NumberSystemType._2);
        System.out.println(result);    //expected 110

        number = new Number(NumberSystemType._16, "6df");
        result = convertNumberToOtherNumberSystem(number, NumberSystemType._8);
        System.out.println(result);    //expected 3337

        number = new Number(NumberSystemType._16, "abcdefabcdef");
        result = convertNumberToOtherNumberSystem(number, NumberSystemType._16);
        System.out.println(result);    //expected abcdefabcdef
    }

    public static Number convertNumberToOtherNumberSystem(Number number, NumberSystem expectedNumberSystem) {
//        if (number.toString().indexOf(expectedNumberSystem.getNumberSystemIntValue()) != -1) {
//            throw new NumberFormatException();
//        }
//        if (number.getNumberSystem() == expectedNumberSystem) return new Number(expectedNumberSystem, number.getDigit());
//
//        String resultNumberStringValue = Integer.toString(
//                Integer.parseInt(number.getDigit(), number.getNumberSystem().getNumberSystemIntValue()),
//                expectedNumberSystem.getNumberSystemIntValue());
//
//        return new Number(expectedNumberSystem, resultNumberStringValue);

        BigInteger bigInteger = new BigInteger(number.getDigit(), number.getNumberSystem().getNumberSystemIntValue());

        return new Number(expectedNumberSystem, bigInteger.toString(expectedNumberSystem.getNumberSystemIntValue()));
    }
}
