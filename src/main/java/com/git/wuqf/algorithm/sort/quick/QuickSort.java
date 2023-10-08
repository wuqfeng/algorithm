package com.git.wuqf.algorithm.sort.quick;

import com.git.wuqf.algorithm.sort.Sort;

import java.util.Arrays;

/**
 * Created by wuqf on 2020/5/14.
 */
public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        quickSorck(arr, 0, arr.length - 1);
        return arr;
    }


    public void quickSorck(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSorck(arr, left, partitionIndex - 1);
            quickSorck(arr, partitionIndex + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int lidx = left;
        int ridx = right;
        while (lidx < ridx) {
            while (arr[ridx] >= pivot && lidx < ridx) {
                ridx--;
            }
            while (arr[lidx] <= pivot && lidx < ridx) {
                lidx++;
            }
            swap(arr, lidx, ridx);
        }
        swap(arr, left, lidx);
        return lidx;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void print(String head, int[] arr) {
        System.out.print(head);
        Arrays.stream(arr).forEach(i -> System.out.print(i + ","));
        System.out.println();
    }

}
