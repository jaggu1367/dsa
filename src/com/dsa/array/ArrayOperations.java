package com.dsa.array;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        traverse(arr);
        insert(arr, 23, 3);

    }

    static void display(int []arr){
        System.out.println(Arrays.toString(arr));
    }

    static void insert(int []arr, int element, int position){

         display(arr);

        int arr2[] = new int[arr.length+1];

        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = arr[i];
        }

        display(arr2);
    }

    //traversal
    static void traverse(int []arr){

        // using for each loop
        for (int a: arr) {
            System.out.println(a);
        }

        // using for loop using loop variable
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        // using java.util.Arrays with streams
        Arrays.stream(arr).forEach(a-> System.out.println(a));
        Arrays.stream(arr).forEach(System.out::println);

    }

    //
}