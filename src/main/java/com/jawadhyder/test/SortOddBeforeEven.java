package com.jawadhyder.test;

/**
 * Write a function to sort a list of numbers so that odd numbers are sorted before even numbers,
 * and relative order is preserved.
 * For example: [1, 2, 4, 3, 7, 16] is sorted as [1, 3, 7, 2, 4, 16]
 */
public class SortOddBeforeEven {
    public static int[] sort(int[] array) {
        int i = 0;
        int oddLast = -1;
        while (i < array.length) {
            if (array[i] % 2 != 0)
            {
                int temp = array[oddLast+1];
                array[oddLast+1] = array[i];
                array[i] = temp;
                oddLast++;
            }
            i++;
        }
        return array;
    }
}
