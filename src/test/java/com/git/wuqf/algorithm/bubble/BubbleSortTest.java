package com.git.wuqf.algorithm.bubble;

import com.git.wuqf.algorithm.order.bubble.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {
    int[] a = {1, 2, 6, 2, 8, 1, 8, 9, 3, 4, 7, 8, 9, 6, 5};
    BubbleSort s = new BubbleSort();

    @Test
    public void testBubbleSort() {
        int[] b = s.sort(a);
        assertArrayEquals(b, Arrays.stream(a).sorted().toArray());
    }
}
