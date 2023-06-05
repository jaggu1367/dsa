package com.dsa.array;

public class ArrayDeclaration {

    public static void main(String[] args) {
        int arr1[] = {};
        int []arr2 = {23, 56, 8};
        int[] arr3 = new int[3];
        int []arr4 = {3, 0, 8, 5};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);
    }
    static void printArray(int []arr){
        System.out.println(">>>>>>"+arr.length);
        for (int a: arr) {
            System.out.println(a);
        }
    }
}