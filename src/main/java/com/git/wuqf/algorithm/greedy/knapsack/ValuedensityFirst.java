package com.git.wuqf.algorithm.greedy.knapsack;

import java.util.List;

public class ValuedensityFirst implements Calculator {

    /**
     * 物品集合
     */
    List<TagObject> obs;
    /**
     * 背包
     */
    Knapsack knapsack;

    @Override
    public int getMaxTotalValue(List<TagObject> obs, int capacity) {
        this.obs = obs;
        this.knapsack = new Knapsack(capacity);

        int maxValue = 0;
        do {
            maxValue = getMaxValue();
        } while (maxValue > 0);

        return knapsack.price;
    }


    private int getMaxValue() {
        int maxValueDensity = 0;
        for (TagObject t : obs) {
            if (t.status == 0 && t.price / t.weight > maxValueDensity && t.weight <= (knapsack.capacity - knapsack.weight)) {
                maxValueDensity = t.price / t.weight;
                t.status = 1;
                knapsack.weight += t.weight;
                knapsack.price += t.price;
            }
        }
        return maxValueDensity;
    }
}
