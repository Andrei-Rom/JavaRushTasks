package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    int quantity;
    @Override
    public void fly() {

    }

    public Plane(int quantity) {
        this.quantity = quantity;
    }
}
