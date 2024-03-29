package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer {
    private String name;

    @Override
    public void update(Observable o, Object arg) {
        Order order = (Order) arg;
        StatisticManager.getInstance().register(new CookedOrderEventDataRow(o.toString(), this.name,
                order.getTotalCookingTime()*60, order.getDishes()));
        ConsoleHelper.writeMessage("Start cooking - " + arg + ", cooking time " + ((Order)arg).getTotalCookingTime() + "min");
        setChanged();
        notifyObservers(arg);
    }

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
