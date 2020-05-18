package com.jawadhyder.test;

import org.junit.Assert;
import org.junit.Test;

public class SortOddBeforeEvenTest {
    @Test
    public void check_correctness_of_sortOddBeforeEven() {
        int[] a = new int[]{1, 2, 4, 3, 7, 16};
        int[] sorted = SortOddBeforeEven.sort(a);
        Assert.assertArrayEquals(sorted, new int[]{1, 3, 7, 2, 4, 16});

    }
}
