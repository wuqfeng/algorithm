package com.git.wuqf.algorithm.order.shell;

import com.git.wuqf.algorithm.order.Sort;

/**
 * Created by wuqf on 2020/5/14.
 */
public class ShellSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            System.out.println("gap is :" + gap);
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                System.out.println("compare start index is :" + i);
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    System.out.println("swap index is :" + j + "," + (j - gap) + " . element is :" + arr[j] + "," + arr[j - gap]);
                    swap(arr, j, j - gap);
                    j -= gap;
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
