package com.teachmeskills.lesson9.task2.run;

import com.teachmeskills.lesson9.task2.utils.Utils;
import com.teachmeskills.lesson9.task2.matrix.Matrix;

public class Runner {
    public static void main(String[] args) {
        int [][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int [][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        Utils.printMatrix(arr1);
        Utils.printMatrix(arr2);
        Utils.printMatrix(Matrix.multiplyMatrix(arr1,arr2));
    }
}
