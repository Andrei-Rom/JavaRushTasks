package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet1 = new Tablet(1);
        Cook cookRamsay = new Cook("Gordon Ramsay");
        tablet1.addObserver(cookRamsay);
        tablet1.createOrder();
        tablet1.createOrder();
        tablet1.createOrder();
        tablet1.createOrder();
    }
}
