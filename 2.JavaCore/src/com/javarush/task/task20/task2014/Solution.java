package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {

        Solution save = new Solution(4);
        System.out.print("New object: ");
        System.out.println(save);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:/Users/Андрей/Downloads/JavaRushTasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2014/temperature"));
            objectOutputStream.writeObject(save);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        Solution load = new Solution(104);
        System.out.print("Before loading: ");
        System.out.println(load);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:/Users/Андрей/Downloads/JavaRushTasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2014/temperature"));
            load = (Solution) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("File not found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        System.out.print("After loading: ");
        System.out.println(load);
        if (save.string.equals(load.string)) System.out.println("Good job!");
    }


    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
