package com.javarush.task.task37.task3702.male;

import com.javarush.task.task37.task3702.AbstractFactory;
import com.javarush.task.task37.task3702.Human;
import com.javarush.task.task37.task3702.male.KidBoy;

public class MaleFactory implements AbstractFactory {
    public Human getPerson (int age){

        if (age > 19) return new Man();
        if (age < 13) return new KidBoy();
        return new TeenBoy();

    }
}
