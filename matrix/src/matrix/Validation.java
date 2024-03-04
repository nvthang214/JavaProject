/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author emlad
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);

    public static int[][] inputMatrix(int Num) {
        System.out.print("Enter row of matrix " + Num + ":");
        int row = getInt();
        System.out.print("Enter column of matrix " + Num + ":");
        int column = getInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Value of matrix"+Num+"["+ (i + 1) + "]" + "["+(j + 1) + "]: ");
                matrix[i][j] = getInt();
            }
        }
        return matrix;
    }

    public static int getInt() {
        Pattern p = Pattern.compile("^[0-9]+$");
        while (true) {
            String str = sc.nextLine();
            if(p.matcher(str).find()){
                return Integer.parseInt(str);
            }
            System.out.println("Input must be a number!!!");
        }
    }
}
