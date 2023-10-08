package com.git.wuqf.algorithm.sort.quick;

import com.git.wuqf.algorithm.sort.Sort;

public class QuickSort2 implements Sort {
    @Override
    public int[] sort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return arr;
        }
        qsort(arr, 0, arr.length - 1);
        return arr;
    }

    private void qsort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int[] equalArea = partation(arr, left, right);
        qsort(arr, left, equalArea[0] - 1);
        qsort(arr, equalArea[1] + 1, right);
    }

    private int[] partation(int[] arr, int left, int right) {
        int less = left - 1;
        int idx = left;
        int more = right;
        int pivot = arr[right];
        while (idx < more) {
            if (arr[idx] < pivot) {
                swap(arr, ++less, idx++);
            } else if (arr[idx] == pivot) {
                idx++;
            } else {
                swap(arr, idx, --more);
            }
        }
        swap(arr, idx, right);
        return new int[]{less + 1, idx};
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
