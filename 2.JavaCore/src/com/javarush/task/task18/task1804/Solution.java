package com.javarush.task.task18.task1804;

        import java.io.BufferedReader;
        import java.io.FileInputStream;
        import java.io.InputStreamReader;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] byteArray  = new int[128];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        FileInputStream fis = new FileInputStream(str);

        while(fis.available() > 0){
            int x = fis.read();
            byteArray[x]++;
        }

        int valueMin = Integer.MAX_VALUE;
        for (int i = 0; i < byteArray.length; i++) {

            int tmpData = byteArray[i];
            if ((tmpData > 0) && (tmpData < valueMin)) valueMin = tmpData;
        }
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] == valueMin) System.out.print(i + " ");
        }
        fis.close();
    }
}

