package com.git.wuqf.algorithm.order.count;

import com.git.wuqf.algorithm.order.Sort;

import java.util.Arrays;

public class CountSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        //获取最大值
        //int max = Arrays.stream(arr).max().getAsInt();
        int max = arr[0];
        for (int i : arr) {
            if (arr[i] > max) {
                max = arr[i];
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
