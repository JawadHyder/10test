package com.jawadhyder.test;

import org.junit.Assert;
import org.junit.Test;

public class SortOddBeforeEvenTest {
    @Test
    public void check_correctness_of_sortOddBeforeEven() {
        int[] a = new int[]{1, 2, 4, 3, 7, 16};
        int[] sorted = SortOddBeforeEven.sort(a);
        Assert.assertArrayEquals(sorted, new int[]{1, 3, 7, 2, 4, 16});

        // Last even
        int[] b = new int[]{1, 3, 5, 7, 16};
        int[] sorted2 = SortOddBeforeEven.sort(b);
        Assert.assertArrayEquals(sorted2, new int[]{1, 3, 5, 7, 16});

        // All odd
        int[] c = new int[]{1, 3, 5, 7};
        int[] sorted3 = SortOddBeforeEven.sort(c);
        Assert.assertArrayEquals(sorted3, new int[]{1, 3, 5, 7});


        // All even
        int[] d = new int[]{2, 4, 8, 16};
        int[] sorted4 = SortOddBeforeEven.sort(d);
        Assert.assertArrayEquals(sorted4, new int[]{2, 4, 8, 16});
    }
}
