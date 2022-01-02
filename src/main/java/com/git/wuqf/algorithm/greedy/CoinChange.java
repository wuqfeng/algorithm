package com.git.wuqf.algorithm.greedy;

/**
 * 硬币找零问题
 * <p>
 * 假设你开了间小店，不能电子支付，钱柜里的货币只有 25 分、10 分、5 分和 1 分四种硬币，如果你是售货员且要找给客户 41 分钱的硬币，如何安排才能找给客人的钱既正确且硬币的个数又最少？
 * <p>
 * 这里需要明确的几个点：
 * 1.货币只有 25 分、10 分、5 分和 1 分四种硬币；
 * 2.找给客户 41 分钱的硬币；
 * 3.硬币最少化
 */
public class CoinChange {
    private static int ONE_FEN = 1;
    private static int FIVE_FEN = 5;
    private static int TEN_FEN = 10;
    private static int TWENTYFINEFEN_FEN = 25;

    public static void main(String[] args) {
        int money = 89;
        int num_25 = 0, num_10 = 0, num_5 = 0, num_1 = 0;

        while (money >= TWENTYFINEFEN_FEN) {
            num_25++;
            money -= TWENTYFINEFEN_FEN;
        }
        while (money >= TEN_FEN) {
            num_10++;
            money -= TEN_FEN;
        }
        while (money >= FIVE_FEN) {
            num_5++;
            money -= FIVE_FEN;
        }
        while (money >= ONE_FEN) {
            num_1++;
            money -= ONE_FEN;
        }
        System.out.println("25分硬币数：" + num_25);
        System.out.println("10分硬币数：" + num_10);
        System.out.println("5分硬币数：" + num_5);
        System.out.println("1分硬币数：" + num_1);
    }
}
