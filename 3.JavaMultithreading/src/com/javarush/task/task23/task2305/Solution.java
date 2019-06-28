package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {

    }

    public static Solution[] getTwoSolutions() {
        Solution[] twoSolition = new Solution[2];
        Solution first = new Solution();
        first.innerClasses[0] = first.new InnerClass();
        first.innerClasses[1] = first.new InnerClass();
        Solution second = new Solution();
        second.innerClasses[0] = second.new InnerClass();
        second.innerClasses[1] = second.new InnerClass();
        twoSolition[0] = first;
        twoSolition[1] = second;
        return twoSolition;
    }

    public static void main(String[] args) {

    }
}
