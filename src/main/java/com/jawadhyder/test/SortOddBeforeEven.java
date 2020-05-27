package com.jawadhyder.test;

/**
 * Write a function to sort a list of numbers so that odd numbers are sorted before even numbers,
 * and relative order is preserved.
 * For example: [1, 2, 4, 3, 7, 16] is sorted as [1, 3, 7, 2, 4, 16] //1 2 4 6 3 7 16
 */
public class SortOddBeforeEven {
    public static int[] sort(int[] array) {

        // Find pivot point
        int pivotIndex = 0;
        for (int num: array) {
            if (num % 2 != 0)
                pivotIndex++;
        }

        int oddIndex = -1;
        int evenIndex = pivotIndex-1;
        int[] sorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // Even
                evenIndex++;
                sorted[evenIndex] = array[i];
            } else { // odd
                oddIndex++;
                sorted[oddIndex] = array[i];
            }
        }

        return sorted;
    }
}
