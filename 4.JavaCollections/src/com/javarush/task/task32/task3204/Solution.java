package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write((byte) (97 + Math.random() * 26));
        byteArrayOutputStream.write((byte) (65 + Math.random() * 26));
        byteArrayOutputStream.write((byte) (48 + Math.random() * 9));
        for (int i = 0; i < 5; i++) {
            int c = ((int) (1 + Math.random() * 8));
//            switch (c) {
//                case (1):
//                case (2):
//                case (3):
//                    byteArrayOutputStream.write((byte) (97 + Math.random() * 26));
//                    break;
//                case (4):
//                case (5):
//                case (6):
//                    byteArrayOutputStream.write((byte) (65 + Math.random() * 26));
//                    break;
//                case (7):
//                case (8):
//                case (9):
//                    byteArrayOutputStream.write((byte) (48 + Math.random() * 9));
//                    break;
//            }

            if (c>= 1 && c <=3) byteArrayOutputStream.write((byte) (97 + Math.random() * 26));
            if (c>= 4 && c <=6) byteArrayOutputStream.write((byte) (65 + Math.random() * 26));
            if (c>= 7 && c <=9) byteArrayOutputStream.write((byte) (48 + Math.random() * 9));
        }
        return byteArrayOutputStream;
    }
}