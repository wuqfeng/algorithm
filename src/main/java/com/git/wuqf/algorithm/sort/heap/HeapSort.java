package com.git.wuqf.algorithm.sort.heap;

import com.git.wuqf.algorithm.sort.Sort;

import java.util.PriorityQueue;

public class HeapSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int item:arr){
            pq.offer(item);
        }
        int i=0;
        while (!pq.isEmpty()){
            arr[i++]=pq.poll();
        }
        return arr;
    }
}
