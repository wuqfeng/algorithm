package com.git.wuqf.algorithm.sort.merge;

import com.git.wuqf.algorithm.sort.Sort;

/**
 * Created by wuqf on 2020/5/14.
 */
public class MergeSort implements Sort {

    int[] help;

    @Override
    public int[] sort(int[] arr) {
        help = new int[arr.length];
        mergesort(arr, 0, arr.length - 1);
        return arr;
    }

    //recursive
    public void mergesort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        int lend = mid, rstart = mid + 1;
        mergesort(arr, start, lend);
        mergesort(arr, rstart, end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int cur = start;
        int lcur = start;
        int rcur = mid + 1;
        while ((lcur <= mid) && (rcur <= end)) {
            help[cur++] = arr[lcur] < arr[rcur] ? arr[lcur++] : arr[rcur++];
        }
        while (lcur <= mid) {
            help[cur++] = arr[lcur++];
        }
        while (rcur <= end) {
            help[cur++] = arr[rcur++];
        }
        for (int i = start; i <= end; i++) {
            arr[i]=help[i];
        }
    }


    //iteration
    public void iterationMergeSort(int[] arr, int[] result, int start, int end) {

    }
}
