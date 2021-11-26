package com.git.wuqf.algorithm.greedy.knapsack;

import java.util.ArrayList;
import java.util.List;

/**
 * 有一个背包，最多能承载重量为 C=150的背包，现在有7个物品（物品不能分割成任意大小），编号为 1~7，重量分别是 wi=[35,30,60,50,40,10,25]，价值分别是 pi=[10,40,30,50,35,40,30]，现在从这 7 个物品中选择一个或多个装入背包，要求在物品总重量不超过 C 的前提下，所装入的物品总价值最高。
 * <p>
 * 这里需要明确的几个点：
 * 1.每个物品都有重量和价值两个属性；
 * 2.每个物品分被选中和不被选中两个状态（后面还有个问题，待讨论）；
 * 3.可选物品列表已知，背包总的承重量一定。
 */
public class KnapsackProblem {

    public static void main(String[] args) {
        List<TagObject> os = init();
        Knapsack knapsack = new ValueFirst();
        int maxValue = knapsack.getMaxTotalValue(os,150);
        System.out.println(maxValue);
    }

    private static List<TagObject> init() {
        List<TagObject> os = new ArrayList<>();
        os.add(new TagObject(35, 10, 0));
        os.add(new TagObject(30, 40, 0));
        os.add(new TagObject(60, 30, 0));
        os.add(new TagObject(50, 50, 0));
        os.add(new TagObject(40, 35, 0));
        os.add(new TagObject(10, 40, 0));
        os.add(new TagObject(25, 30, 0));
        return os;
    }

}
