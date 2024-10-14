package com.example;

public class InsertionSort {

    /* This function sorts an array using insertion sort */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
        }
    }


    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };

        // Call insertion sort
        insertionSort(arr);

        
    }
}
