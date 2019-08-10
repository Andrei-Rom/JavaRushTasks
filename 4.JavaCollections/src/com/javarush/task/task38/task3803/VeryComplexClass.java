package com.javarush.task.task38.task3803;

/* 
Runtime исключения (unchecked exception)
*/

import javax.sound.midi.Soundbank;
import java.util.List;

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object object = new Integer(5);
        System.out.print((Short) object);
    }

    public void methodThrowsNullPointerException() {
        List<String> list = null;
        System.out.print(list.size());
    }

    public static void main(String[] args) {

    }
}
