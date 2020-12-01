package com.git.wuqf.algorithm.order.selection;

import com.git.wuqf.algorithm.order.Sort;

/**
 * Created by wuqf on 2020/5/14.
 */
public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;
                }
            }
        }
        return arr;
    }
}
