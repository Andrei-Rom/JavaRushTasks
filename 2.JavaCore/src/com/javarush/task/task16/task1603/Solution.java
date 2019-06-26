package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        Thread thread6 = new Thread(new SpecialThread());
        Thread thread7 = new Thread(new SpecialThread());
        Thread thread8 = new Thread(new SpecialThread());
        Thread thread9 = new Thread(new SpecialThread());
        Thread thread10 = new Thread(new SpecialThread());

        Collections.addAll(list, thread6, thread7, thread8, thread9, thread10);
    }

    public static class SpecialThread extends Thread implements Runnable {
        public void run() {

            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
