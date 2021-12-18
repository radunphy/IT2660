// Ryan Dunphy Assignment 6
package com.company;

public class Main {

    public static void main(String[] args) {
        int data[] = new int[100];

        MergeSort.fill(data);
        MergeSort.print(data);
        MergeSort.mergeSort(data, 0, 99);
        MergeSort.print(data);
    }
}
