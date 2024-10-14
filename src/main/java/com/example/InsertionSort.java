package com.example;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 1, 10, 22, 3 };
        int n = arr.length;

        //insert sort operation
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        //print sorted array
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
