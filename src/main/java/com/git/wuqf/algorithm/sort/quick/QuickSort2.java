package com.git.wuqf.algorithm.sort.quick;

import com.git.wuqf.algorithm.sort.Sort;

public class QuickSort2 implements Sort {
    @Override
    public int[] sort(int[] nums) {
        if(nums==null||nums.length==1){
            return nums;
        }
        process(nums,0,nums.length-1);
        return nums;
    }
    public void process(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        int[] equalArea=netherlandsFlag(nums, left, right);
        process(nums,left,equalArea[0]-1);
        process(nums,equalArea[1]+1,right);
    }
    public int[] netherlandsFlag(int[] nums,int left,int right){
        if(left>right){
            return new int[]{-1,-1};
        }
        if(left==right){
            return new int[]{left,right};
        }
        int less=left-1;
        int more=right;
        int index=left;
        while(index<more){
            if(nums[index]==nums[right]){
                index++;
            }
            else if(nums[index]<nums[right]){
                swap(nums,index++,++less);
            }
            else{
                swap(nums,index,--more);
            }
        }
        swap(nums,more,right);
        return new int[]{less+1,more};
    }
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
