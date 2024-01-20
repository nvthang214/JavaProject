/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Validation valid = new Validation();
        int n = valid.Valid("Enter number of array: ");
        GetArray gr = new GetArray();
        int[] array = gr.getArray(n);

        System.out.println("Unsorted array: " + Arrays.toString(array));

        InsertionSort is = new InsertionSort();
        is.insertionSort(array);
        System.out.println("Sorted array  : " + Arrays.toString(array));

    }

}
