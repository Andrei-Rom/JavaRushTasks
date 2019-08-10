package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.OurHashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static com.javarush.task.task33.task3310.Helper.generateRandomString;
import static com.javarush.task.task33.task3310.Helper.printMessage;

public class Solution {
    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(), 1000);
        testStrategy(new OurHashMapStorageStrategy(), 1000);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> keys = new HashSet<>();
        for (String value : strings) {
            keys.add(shortener.getId(value));
        }
        return keys;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Set<String> values = new HashSet<>();
        for (Long key : keys) {
            values.add(shortener.getString(key));
        }
        return values;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        printMessage(strategy.getClass().getSimpleName());
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < elementsNumber; i++) {
            strings.add(generateRandomString());
        }
        Shortener shortener = new Shortener(strategy);

        Date startIds = new Date();
        Set<Long> ids = getIds(shortener, strings);
        Date endIds = new Date();

        Date startStrings = new Date();
        Set<String> resultStrings = getStrings(shortener, ids);
        Date endStrings = new Date();

        printMessage(endIds.getTime() - startIds.getTime() + " - getIds");
        printMessage(endStrings.getTime() - startStrings.getTime() + " - getStrings");
        if (strings.containsAll(resultStrings)) {
            printMessage("Тест пройден.");
        } else {
            printMessage("Тест не пройден.");
        }


    }
}
