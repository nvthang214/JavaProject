/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import controller.BinarySearch;
import controller.GetArray;
import controller.MergeSort;
import validation.Validation;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Validation valid = new Validation();
        int n = valid.Valid("Enter number of array: ");
        int value = valid.Valid("Enter value          : ");

        GetArray ga = new GetArray();
        int[] array = ga.getArray(n);

        System.out.println("Unsorted array: " + Arrays.toString(array));

        MergeSort ms = new MergeSort();
        ms.mergeSort(array);
        System.out.println("Sorted array  : " + Arrays.toString(array));
        BinarySearch bns = new BinarySearch();
        int rs = bns.binarySearch(array, value);
        if (rs != -1) {
            System.out.println(value + " at the index " + rs);
        } else {
            System.out.println("Value does not exist");
        }

    }

}
