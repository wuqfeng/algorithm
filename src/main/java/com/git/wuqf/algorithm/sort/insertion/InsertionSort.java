package com.git.wuqf.algorithm.sort.insertion;

import com.git.wuqf.algorithm.sort.Sort;

/**
 * Created by wuqf on 2020/5/14.
 */
public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }

}
