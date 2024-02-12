package com.teachmeskills.lesson9.task2.utils;

public class Utils{
    public static void printMatrix(int[][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("__________");
    }
}
