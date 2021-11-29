package com.git.wuqf.algorithm.greedy.knapsack;

import java.util.List;

public class ValueFirst implements Calculator {

    /**
     * 物品集合
     */
    List<TagObject> obs;
    Knapsack knapsack;

    @Override
    public int getMaxTotalValue(List<TagObject> obs, int capacity) {
        this.obs = obs;
        knapsack = new Knapsack(capacity);

        int maxValue = 0;
        do {
            maxValue = getMaxValue();
        } while (maxValue > 0);

        return knapsack.price;
    }

    private int getMaxValue() {
        int maxValue = 0;
        for (TagObject t : obs) {
            if (t.status == 0 && t.price > maxValue && t.weight <= (knapsack.capacity - knapsack.weight)) {
                maxValue = t.price;
                t.status = 1;
                knapsack.weight += t.weight;
                knapsack.price += t.price;
            }
        }
        return maxValue;
    }
}
