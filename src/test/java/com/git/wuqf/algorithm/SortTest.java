package com.git.wuqf.algorithm;

import com.git.wuqf.algorithm.sort.bubble.BubbleSort;
import com.git.wuqf.algorithm.sort.count.CountSort;
import com.git.wuqf.algorithm.sort.insertion.InsertionSort;
import com.git.wuqf.algorithm.sort.merge.MergeSort;
import com.git.wuqf.algorithm.sort.quick.QuickSort;
import com.git.wuqf.algorithm.sort.quick.QuickSort2;
import com.git.wuqf.algorithm.sort.selection.SelectionSort;
import com.git.wuqf.algorithm.sort.shell.ShellSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    int[] a = {4, 1, 6, 2, 8, 1, 8, 9, 3, 4, 7, 8, 9, 6, 5};


    @Test
    public void testBubbleSort() {
        int[] ints = generateRandomArray(100, 100);
        int[] c=copyArr(ints);
        BubbleSort b = new BubbleSort();
        int[] s = b.sort(ints);
        assertArrayEquals(s, Arrays.stream(c).sorted().toArray());
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
        int[] b = {1, 3, 4, 2};
        MergeSort c = new MergeSort();
        int[] sortedArray = c.sort(b);
        assertArrayEquals(sortedArray, Arrays.stream(b).sorted().toArray());
    }

    @Test
    public void testQuickSortSort() {
        QuickSort c = new QuickSort();
        int[] sortedArray = c.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(a).sorted().toArray());
    }

    @Test
    public void testQuickSort2Sort() {
        int[] b = {1, 3, 9, 4, 2, 3, 7, 4};
        QuickSort2 c = new QuickSort2();
        int[] sortedArray = c.sort(b);
        assertArrayEquals(sortedArray, Arrays.stream(b).sorted().toArray());
    }

    @Test
    public void testShellSortSort() {
        //int[] a = {5, 7, 8, 3, 1, 2, 4, 6};
        ShellSort c = new ShellSort();
        int[] sortedArray = c.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(a).sorted().toArray());
    }

    private int[] generateRandomArray(int maxSize, int maxValue) {
        Random random = new Random();
        int size = random.nextInt(maxSize + 1);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxValue + 1);
        }
        return arr;
    }

    private int[] copyArr(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] c = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            c[i] = arr[i];
        }
        return c;
    }
}
