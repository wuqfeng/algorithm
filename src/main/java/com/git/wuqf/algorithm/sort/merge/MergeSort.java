package com.git.wuqf.algorithm.sort.merge;

import com.git.wuqf.algorithm.sort.Sort;

/**
 * Created by wuqf on 2020/5/14.
 */
public class MergeSort implements Sort {

    int[] help;
    @Override
    public int[] sort(int[] arr) {
        help= new int[arr.length];
        mergesort(arr, 0, arr.length - 1);
        return arr;
    }

    //recursive
    public void mergesort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int length = end - start ;
        int mid = start + (length >> 1);
        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int lstart = start;
        int rstart = mid + 1;

        int k = start;
        while (lstart <= mid && rstart <= end) {
            help[k++] = arr[lstart] < arr[rstart] ? arr[lstart++] : arr[rstart++];
        }
        while (lstart <= mid) {
            help[k++] = arr[lstart++];
        }
        while (rstart <= end) {
            help[k++] = arr[rstart++];
        }
        for (int i = start; i <= end; i++) {
            arr[i] = help[i];
        }
    }

    //iteration
    public void iterationMergeSort(int[] arr, int[] result, int start, int end) {

    }
}
