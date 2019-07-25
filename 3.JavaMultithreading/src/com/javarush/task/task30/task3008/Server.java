package com.javarush.task.task30.task3008;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введи порт сервера");

        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("сервер запущен");
            while (true) {
                new Handler(serverSocket.accept()).start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("ОШИБКА!");
        }

    }

    private static class Handler extends Thread {
        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }
    }
}
