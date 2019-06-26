package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution implements Person {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
      /*  while (true){
            if ((reader.readLine()).equals("user")) doWork(new User());
            else if ((reader.readLine()).equals("loser")) doWork(new Loser());
            else if ((reader.readLine()).equals("coder")) doWork(new Coder());
            else if ((reader.readLine()).equals("proger")) doWork(new Proger());
            else break;

        }

       */
        while(true) {
            key = reader.readLine();
            if ("user".equals(key))          person = new Person.User();
            else if ("loser".equals(key))  person = new Person.Loser();
            else if ("coder".equals(key)) person = new Person.Coder();
            else if ("proger".equals(key)) person = new Person.Proger();
            else break;
            doWork(person); //вызываем doWork
        }


    }

    public static void doWork(Person person) {
        // пункт 3
        if (person  instanceof User) ((User) person).live();
        if (person  instanceof Loser) ((Loser) person).doNothing();
        if (person  instanceof Coder) ((Coder) person).writeCode();
        if (person  instanceof Proger) ((Proger) person).enjoy();

    }
}
