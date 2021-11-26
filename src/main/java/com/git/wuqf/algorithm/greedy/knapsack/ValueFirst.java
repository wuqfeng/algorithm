package com.git.wuqf.algorithm.greedy.knapsack;

import java.util.List;

public class ValueFirst implements Knapsack {

    List<TagObject> os;

    @Override
    public int getMaxTotalValue(List<TagObject> obs, int capacity) {
        int max = 0;
        int c = capacity;
        for (TagObject t : obs) {

        }
        return 0;
    }

    public int getMaxValue(List<TagObject> obs, int capacityLeft) {
        int maxValue = 0;
        for (TagObject t : obs) {
            if (t.status == 0 && t.price > maxValue && t.weight < capacityLeft) {
                maxValue = t.price;
                t.status = 1;

            }
        }
        return maxValue;
    }
}
