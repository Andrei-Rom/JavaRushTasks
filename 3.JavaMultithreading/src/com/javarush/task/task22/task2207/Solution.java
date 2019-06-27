package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;


/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String line;
                String[] subStr;
                StringBuilder stringBuilder = new StringBuilder();
                while ((line = fileReader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append(" ");
                }
                String all = stringBuilder.toString();
                subStr = all.split(" ");
                for (int i = 0; i < subStr.length - 1; i++) {
                    for (int j = i+ 1; j < subStr.length; j++) {
                        StringBuilder reverS = new StringBuilder(subStr[j]);
                        reverS.reverse();
                        String stringRevarS = reverS.toString();
                        if (subStr[i].equals(stringRevarS)) {
                            Pair pairI = new Pair();
                            pairI.first = subStr[i];
                            pairI.second = subStr[j];
                            Pair pairJ = new Pair();
                            pairJ.first = subStr[j];
                            pairJ.second = subStr[i];
                            if (!result.contains(pairI) && !result.contains(pairJ)) {
                                result.add(pairI);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }
    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
