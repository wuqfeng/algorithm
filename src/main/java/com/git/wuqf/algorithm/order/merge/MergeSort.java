package com.git.wuqf.algorithm.order.merge;

import com.git.wuqf.algorithm.order.Sort;

/**
 * Created by wuqf on 2020/5/14.
 */
public class MergeSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        mergeSort(arr, result, 0, len - 1);
        return result;
    }

    public void mergeSort(int[] arr, int[] result, int start, int end) {
        if (start >= end) {
            return;
        }
        int len = end - start, mid = start + (len >> 1);
        int lstart = start, lend = mid;
        int rstart = mid + 1, rend = end;
        mergeSort(arr, result, lstart, lend);
        mergeSort(arr, result, rstart, rend);
        int k = start;
        while (lstart <= lend && rstart <= rend) {
            result[k++] = arr[lstart] < arr[rstart] ? arr[lstart++] : arr[rstart++];
        }
        while (lstart <= lend) {
            result[k++] = arr[lstart++];
        }
        while (rstart <= rend) {
            result[k++] = arr[rstart++];
        }
    }
}
