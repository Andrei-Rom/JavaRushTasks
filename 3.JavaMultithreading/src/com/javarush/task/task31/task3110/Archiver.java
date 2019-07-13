package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {

        Operation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        } while (operation != Operation.EXIT);
    }

    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage(String.format("%d - %s%n", Operation.CREATE.ordinal(), Operation.CREATE.getDescription()));
        ConsoleHelper.writeMessage(String.format("%d - %s%n", Operation.ADD.ordinal(), Operation.ADD.getDescription()));
        ConsoleHelper.writeMessage(String.format("%d - %s%n", Operation.REMOVE.ordinal(), Operation.REMOVE.getDescription()));
        ConsoleHelper.writeMessage(String.format("%d - %s%n", Operation.EXTRACT.ordinal(), Operation.EXTRACT.getDescription()));
        ConsoleHelper.writeMessage(String.format("%d - %s%n", Operation.CONTENT.ordinal(), Operation.CONTENT.getDescription()));
        ConsoleHelper.writeMessage(String.format("%d - %s%n", Operation.EXIT.ordinal(), Operation.EXIT.getDescription()));

        return Operation.values()[ConsoleHelper.readInt()];
    }
}