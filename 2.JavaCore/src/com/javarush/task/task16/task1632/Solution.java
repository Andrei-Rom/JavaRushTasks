package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) throws InterruptedException {
        threads.get(4).start();
        threads.get(4).join();
        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();
            }
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }



    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true){

            }
        }
    }

    public static class Thread2 extends Thread{
        public void run() {
            while (true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }
    public static class Thread3 extends Thread{
        public void run() {
            while (true){
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void showWarning() {
            this.interrupt();
        }
        @Override
        public void run() {
            while (!this.isInterrupted()){
            }
        }
    }
  public static class Thread5 extends Thread{
      /*  public void run() {
            try { int i = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s;
            s = reader.readLine();
            while (!s.equals("N")){
                i = i + Integer.parseInt(s);
            }
            reader.close();
            System.out.println(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
       } */
      public void run() {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          int integer = 0;
          while (true)
          {
              String s = null;
              try {s = reader.readLine();}catch (Exception e){}
              if (!s.equals("N")) {
                  int num = Integer.parseInt(s);
                  integer = integer + num;
              }else break;


          }System.out.println(integer);
      }
    }
}