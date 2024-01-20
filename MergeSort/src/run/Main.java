/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import data.GetArray;
import data.MergeSort;
import data.Validation;
import java.util.Arrays;

public class Main {

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
        

    }

}
