package com.teachmeskills.lesson9.task2.matrix;

public class Matrix {
    public static int[][] multiplyMatrix(int[][]arr1, int[][]arr2) {
        int[][] finalMatrix = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < finalMatrix.length; i++) {
            for (int j = 0; j < finalMatrix[0].length; j++) {
                finalMatrix[i][j] = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    finalMatrix[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return finalMatrix;
    }
}
