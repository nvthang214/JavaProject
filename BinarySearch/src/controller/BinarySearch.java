/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author emlad
 */
public class BinarySearch {

    public int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if value is present at the middle
            if (array[mid] == value) {
                return mid;
            }

            // If value is greater, ignore the left half
            if (array[mid] < value) {
                left = mid + 1;
            } // If value is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target is not present in the array
        return -1;
    }
}

