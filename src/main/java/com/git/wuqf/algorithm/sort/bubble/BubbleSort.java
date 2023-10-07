package com.git.wuqf.algorithm.sort.bubble;

import com.git.wuqf.algorithm.sort.Sort;

import java.util.Collections;

/**
 * Created by wuqf on 2020/5/14.
 * 冒泡排序算法
 */
public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
