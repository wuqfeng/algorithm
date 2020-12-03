package com.git.wuqf.algorithm.order.shell;

import com.git.wuqf.algorithm.order.Sort;

/**
 * Created by wuqf on 2020/5/14.
 */
public class ShellSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {//increment表示增量
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        swap(arr, j, j + gap);
                    }
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
