package com.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InsertionSort {
    private static int count = 0;

  // get array of cupcake names
    public static String[] nameArray(JSONArray cupcakeArray) {
        String[] arr = new String[cupcakeArray.size()];

        // get names from JSON objects
        for (int i = 0; i < cupcakeArray.size(); i++) {
            JSONObject o = (JSONObject) cupcakeArray.get(i);
            String name = (String) o.get("name");
            arr[i] = name;
        }
        return arr;
    }

    public static void main(String[] args) {
        String fileName = "cupcake_3906.json";
        
        // read cupcake names
        JSONArray cupcakeArray = JSONFile.readArray(fileName);
        String[] cupcakeNameArray = nameArray(cupcakeArray);
        
        // print unsorted list
        System.out.println("----- Unsorted array -----");
        print(cupcakeNameArray);

          // call insertion sort function
          insertionSort(cupcakeNameArray);

         // print sorted list
         System.out.println("----- Sorted array -----");
         print(cupcakeNameArray);
 
         // print statistics
         System.out.println("----- Statistics -----");
         System.out.printf("Size of array = %d\n", cupcakeNameArray.length);
         System.out.printf("Count = %d\n", count);
    }
    
     // insertion sort function
     public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            // We move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
                // Increase count for each comparison
                count++;
            }
            arr[j + 1] = key;
            // Increase count for placing the key
            count++;
        }
    }

     // print the array
     public static void print(String[] cupcakeNameArray) {
        System.out.printf("Number\tName\n");
        System.out.printf("------\t---------------\n");
        for (int i = 0; i < cupcakeNameArray.length; i++) {
            System.out.printf("%04d\t%s\n", i, cupcakeNameArray[i]);
        }
    }
}
