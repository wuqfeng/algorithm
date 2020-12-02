package com.git.wuqf.algorithm;

import com.git.wuqf.algorithm.order.bubble.BubbleSort;
import com.git.wuqf.algorithm.order.count.CountSort;
import com.git.wuqf.algorithm.order.insertion.InsertionSort;
import com.git.wuqf.algorithm.order.merge.MergeSort;
import com.git.wuqf.algorithm.order.quick.QuickSort;
import com.git.wuqf.algorithm.order.selection.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    int[] a = {4, 1, 6, 2, 8, 1, 8, 9, 3, 4, 7, 8, 9, 6, 5};


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

    @Test
    public void testCountSort2() {
        int[] a = {95, 94, 91, 98, 99, 90, 99, 93, 91, 92};
        CountSort c = new CountSort();
        int[] sortedArray = c.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(a).sorted().toArray());
    }

    @Test
    public void testSelectionSort() {
        SelectionSort c = new SelectionSort();
        int[] sortedArray = c.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(a).sorted().toArray());
    }

    @Test
    public void testInsertionSort() {
        InsertionSort c = new InsertionSort();
        int[] sortedArray = c.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(a).sorted().toArray());
    }

    @Test
    public void testMergeSortSort() {
        MergeSort c = new MergeSort();
        int[] sortedArray = c.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(a).sorted().toArray());
    }

    @Test
    public void testQuickSortSort() {
        QuickSort c = new QuickSort();
        int[] sortedArray = c.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(a).sorted().toArray());
    }
}
