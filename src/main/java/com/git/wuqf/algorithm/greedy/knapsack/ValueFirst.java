package com.git.wuqf.algorithm.greedy.knapsack;

import java.util.List;

public class ValueFirst implements Calculator {

    List<TagObject> os;

    @Override
    public int getMaxTotalValue(List<TagObject> obs, int capacity) {
        Knapsack knapsack = new Knapsack(capacity);

        for (TagObject t : obs) {

        }
        return 0;
    }

    public int getMaxValue(List<TagObject> obs, Knapsack knapsack) {
        int maxValue = 0;
        for (TagObject t : obs) {
            if (t.status == 0 && t.price > maxValue && t.weight < (knapsack.capacity - knapsack.weight)) {
                maxValue = t.price;
                t.status = 1;
                knapsack
            }
        }
        return maxValue;
    }
}
