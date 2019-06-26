package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for(int s=0;s<=array.length-1;s++){
            for(int k=0;k<=array.length-2;k++){
                if(array[k]<array[k+1]){   //comparing array values

                    int temp=0;
                    temp=array[k];     //storing value of array in temp variable

                    array[k]=array[k+1];    //swaping values
                    array[k+1]=temp;    //now storing temp value in array


                }    //end if block
            }  // end inner loop
        }
//end outer loop

    }
}
