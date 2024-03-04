/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;


/**
 *
 * @author emlad
 */
// MatrixOperations.java
public class MatrixOperations {

    public static int[][] addSubMatrix(int[][] matrix1, int[][] matrix2, char opera) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        int maxRows = Math.max(rows1, rows2);
        int maxColumns = Math.max(columns1, columns2);
        int[][] result = new int[maxRows][maxColumns];

        for (int i = 0; i < maxRows; i++) {
            for (int j = 0; j < maxColumns; j++) {
                int value1 = (i < rows1 && j < columns1) ? matrix1[i][j] : 0;
                int value2 = (i < rows2 && j < columns2) ? matrix2[i][j] : 0;
                switch (opera) {
                    case '+':
                        result[i][j] = value1 + value2;
                        break;
                    case '-':
                        result[i][j] = value1 - value2;
                        break;
                    default:

                }
            }
        }

        return result;
    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        if (columns1 != rows2) {
            System.out.println("Không thể nhân hai ma trận với số hàng và số cột không phù hợp.");
            return null;
        }

        int[][] result = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Ma trận không tồn tại.");
            return;
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
}
