package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> order = new ArrayList<>();
        writeMessage("выберите блюдо");
        writeMessage(Dish.allDishesToString());
        String request;
        while (!(request = readString()).equals("exit")) {
            if (Dish.allDishesToString().contains(request)) {
                for (Dish dish : Dish.values()) {
                    if (dish.name().equals(request)) {
                        order.add(dish);
                        break;
                    }
                }
            } else {
                writeMessage("такого блюда нет в меню");
            }
        }
        return order;
    }

}
