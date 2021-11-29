package com.git.wuqf.algorithm.greedy.knapsack;

/**
 * 背包类
 */
public class Knapsack {
    public Knapsack(int capacity) {
        this.capacity = capacity;
        this.weight = 0;
        this.price = 0;
    }

    int capacity;
    int weight;
    int price;
}
