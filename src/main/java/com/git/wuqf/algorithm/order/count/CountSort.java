package com.git.wuqf.algorithm.order.count;

import com.git.wuqf.algorithm.order.Sort;

import java.util.Arrays;

public class CountSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        return improvedCountSort(arr);
    }

    /**
     * 减少空间占用
     *
     * @param arr
     * @return
     */
    public int[] improvedCountSort(int[] arr) {
        //获取最大值最小值
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int countArraySize = max - min + 1;
        int[] countArray = new int[countArraySize];
        for (int i = 0; i < countArraySize; i++) {
            countArray[arr[i] - min]++;
        }
        int index = 0;
        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < countArraySize; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i + min;
            }
        }
        return sortedArray;
    }

    public int[] simpleCountSort(int[] arr) {
        //获取最大值
        //int max = Arrays.stream(arr).max().getAsInt();
        int max = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        //生成统计数组
        int[] countArray = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        //遍历统计数组，输出结果
        int index = 0;
        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i;
            }
        }
        return sortedArray;
    }
}
