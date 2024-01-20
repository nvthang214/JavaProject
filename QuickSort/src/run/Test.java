/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import data.*;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Validation valid = new Validation();
        int n = valid.Valid("Enter number of array: ");
        int value = valid.Valid("Enter value          : ");

        GetArray gr = new GetArray();
        int[] array = gr.getArray(n);

        System.out.println("Unsorted array: " + Arrays.toString(array));

        MergeSort ms = new MergeSort();
        ms.mergeSort(array);
        System.out.println("Sorted array  : " + Arrays.toString(array));
        BinarySearch bns = new BinarySearch();
        int rs = bns.binarySearch(array, value);
        System.out.println(rs);
        if (rs != -1) {
            System.out.println(value + " at the index " + rs);
        } else {
            System.out.println("Value does not exist");
        }

    }

}
