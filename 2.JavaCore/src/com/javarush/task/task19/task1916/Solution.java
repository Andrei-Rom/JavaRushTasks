package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOriginal = reader.readLine();
//        String fileOriginal = args[0];
        String fileEdit = reader.readLine();
//        String fileEdit = args[1];
        reader.close();
        BufferedReader fileReader;
        fileReader = new BufferedReader(new FileReader(fileOriginal));
        List<String> originalList = new ArrayList<>();
        List<String> editList = new ArrayList<>();
        String input;
        while ((input = fileReader.readLine()) != null) {
            originalList.add(input);
        }
        fileReader.close();
        fileReader = new BufferedReader(new FileReader(fileEdit));
        while ((input = fileReader.readLine()) != null) {
            editList.add(input);
        }
        fileReader.close();

        int i = 0;
        int j = 0;
        while (originalList.size() != 0 & editList.size() !=0) {
            if (originalList.get(0).equals(editList.get(0))) {
                lines.add(new LineItem(Type.SAME, originalList.get(0)));
                originalList.remove(0);
                editList.remove(0);
            }
            else if (originalList.size() != 1 && originalList.get(1).equals(editList.get(0))) {
                lines.add(new LineItem(Type.REMOVED, originalList.get(0)));
                originalList.remove(0);

            }
            else if (editList.size() != 1 && originalList.get(0).equals(editList.get(1))) {
                lines.add(new LineItem(Type.ADDED, editList.get(0)));
                editList.remove(0);
            }

        }

        if (originalList.size() != 0) {
            lines.add(new LineItem(Type.REMOVED, originalList.remove(0)));
        } else if (editList.size() != 0) {
            lines.add(new LineItem(Type.ADDED, editList.remove(0)));
        }

//        lines.forEach(System.out::println);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
/*
        @Override
        public String toString() {
            return "LineItem{" +
                    "type=" + type +
                    ", line='" + line + '\'' +
                    '}';
        }

 */
    }
}
