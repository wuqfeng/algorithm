package com.git.wuqf.algorithm;

import com.git.wuqf.algorithm.order.bubble.BubbleSort;
import com.git.wuqf.algorithm.order.count.CountSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    int[] a = {1, 2, 6, 2, 8, 1, 8, 9, 3, 4, 7, 8, 9, 6, 5};


    @Test
    public void testBubbleSort() {
        BubbleSort b = new BubbleSort();
        int[] s = b.sort(a);
        assertArrayEquals(s, Arrays.stream(a).sorted().toArray());
    }

    @Test
    public void testCountSort() {
        CountSort c = new CountSort();
        int[] sortedArray = c.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(a).sorted().toArray());
    }
}
