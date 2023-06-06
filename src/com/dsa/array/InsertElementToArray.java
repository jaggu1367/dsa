package com.dsa.array;
import java.util.Arrays;

public class InsertElementToArray {
    public static void main(String[] args) {
        // Original array
        int[] array = { 1, 2, 3, 4, 5 };

        // Element to be inserted
        int newElement = 6;

        // Position at which to insert the new element
        int position = 2; // Insert at index 2 (0-based index)

        // Create a new array with increased length
        int[] newArray = new int[array.length + 1];

        // Copy the elements up to the insertion position
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element
        newArray[position] = newElement;

        // Copy the remaining elements after the insertion position
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        // Print the updated array
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("New Array after inserting " + newElement + " at position " + position + ": " + Arrays.toString(newArray));
    }
}
