package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet1 = new Tablet(1);
        Cook cookRamsay = new Cook("Gordon Ramsay");
        Waiter ghost = new Waiter();
        cookRamsay.addObserver(ghost);
        tablet1.addObserver(cookRamsay);
        tablet1.createOrder();

    }
}
