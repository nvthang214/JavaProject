/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author emlad
 */
public class MergeSort {
    public void mergeSort(int[] array){
        int length = array.length;
        if(length<=1) return;
        
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        
        int i = 0;
        int j = 0;
        
        for (; i < length; i++) {
            if(i<middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
                  
    }
    public void merge(int[] leftArray, int[] rightArray, int [] array){
        int leftSize = array.length/2;
        int rightize = array.length - leftSize;
        int i = 0, l = 0,r = 0;
        
        while(l< leftSize && r <rightize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l< leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}