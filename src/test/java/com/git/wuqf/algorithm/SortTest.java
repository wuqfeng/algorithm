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
        int[] a = generateRandomArray(100, 100);
        int[] c=copyArr(a);
        CountSort countSort = new CountSort();
        int[] sortedArray = countSort.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(c).sorted().toArray());
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
        int[] a = generateRandomArray(100, 100);
        int[] c=copyArr(a);
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(c).sorted().toArray());
    }

    @Test
    public void testInsertionSort() {
        int[] a = generateRandomArray(100, 100);
        int[] c=copyArr(a);
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArray = insertionSort.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(c).sorted().toArray());
    }

    @Test
    public void testMergeSortSort() {
        int[] a = generateRandomArray(500000, 500000);
        int[] c=copyArr(a);
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(c).sorted().toArray());
    }

    @Test
    public void testQuickSortSort() {
        int[] a = generateRandomArray(100, 100);
        int[] c=copyArr(a);
        QuickSort quickSort = new QuickSort();
        int[] sortedArray = quickSort.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(c).sorted().toArray());
    }

    @Test
    public void testQuickSort2Sort() {
        int[] a = generateRandomArray(100, 100);
        int[] c=copyArr(a);
        QuickSort2 q2 = new QuickSort2();
        int[] sortedArray = q2.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(c).sorted().toArray());
    }

    @Test
    public void testShellSortSort() {
        int[] a = generateRandomArray(100, 100);
        int[] c=copyArr(a);
        ShellSort shellSort = new ShellSort();
        int[] sortedArray = shellSort.sort(a);
        assertArrayEquals(sortedArray, Arrays.stream(c).sorted().toArray());
    }

    private int[] generateRandomArray(int maxSize, int maxValue) {
        Random random = new Random();
        //int size = random.nextInt(maxSize + 1);
        int size=maxSize;
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
