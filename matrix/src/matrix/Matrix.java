/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

// MatrixCalculator.java

public class Matrix {
    public static void main(String[] args) {

        int[][] matrix1 = Validation.inputMatrix(1);
        int[][] matrix2 = Validation.inputMatrix(2);

        int[][] sumMatrix = MatrixOperations.addSubMatrix(matrix1, matrix2, '+');
        int[][] diffMatrix = MatrixOperations.addSubMatrix(matrix1, matrix2,'-');
        int[][] productMatrix = MatrixOperations.multiplyMatrix(matrix1, matrix2);

        System.out.println("Tổng của hai ma trận:");
        MatrixOperations.printMatrix(sumMatrix);
        System.out.println("Hiệu của hai ma trận:");
        MatrixOperations.printMatrix(diffMatrix);
        System.out.println("Tích của hai ma trận:");
        MatrixOperations.printMatrix(productMatrix);
    }

    
}