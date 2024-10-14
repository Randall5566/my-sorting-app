package com.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InsertionSort {
    private static int count = 0;

  // Get array of cupcake names
    public static String[] nameArray(JSONArray cupcakeArray) {
        String[] arr = new String[cupcakeArray.size()];

        // Get names from JSON objects
        for (int i = 0; i < cupcakeArray.size(); i++) {
            JSONObject o = (JSONObject) cupcakeArray.get(i);
            String name = (String) o.get("name");
            arr[i] = name;
        }
        return arr;
    }

    public static void main(String[] args) {
        String fileName = "cupcake_3906.json";
        
        // Read cupcake names
        JSONArray cupcakeArray = JSONFile.readArray(fileName);
        String[] cupcakeNameArray = nameArray(cupcakeArray);
        
        // Print unsorted list
        System.out.println("----- Unsorted array -----");
        print(cupcakeNameArray);
    }
    
     // Print cupcake array
     public static void print(String[] cupcakeNameArray) {
        System.out.printf("Number\tName\n");
        System.out.printf("------\t---------------\n");
        for (int i = 0; i < cupcakeNameArray.length; i++) {
            System.out.printf("%04d\t%s\n", i, cupcakeNameArray[i]);
        }
    }
}
