package com.company;
import java.util.Random;

public class MergeSort {
    // Create an array of random numbers.
    public static void fill(int array[]){
        Random filledArray = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = filledArray.nextInt(1000);
        }
    }
    // Display the values of the integers in the array.
    public static void print(int printArray[]){
        System.out.println("The elements of this array are: ");
        for (int i=0; i < printArray.length; i++){
            System.out.println(printArray[i]);
        }
    }
    public static void merge(int array[], int left, int mid, int right){
        int leftValue = mid;
        int rightValue = mid + 1;
        int low = left;
        while ((low <= leftValue) && (rightValue <= right)){
            if (array[leftValue] < array[rightValue]){
                leftValue++;
            }
            else {
                int temp = array[rightValue];
                for (int i = rightValue - 1; i >= leftValue; i--){
                    array[i+1] = array[i];
                }
                array[leftValue] = temp;
                left++;
                leftValue++;
                rightValue++;
            }
        }
    }
    public static void mergeSort(int array[], int left, int right) {
        // base case
        if (left >= right){
            return;
        }
        int mid = (left + right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }
}
