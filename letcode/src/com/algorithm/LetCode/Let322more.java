package com.algorithm.LetCode;

import java.util.Arrays;

public class Let322more {

    int count = 0; // 用于统计递归调用次数


    int[] dp;

    public int coinChange(int[] coins, int amount) {
        count = 0; // 重置计数器
         dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        int result = coinChangeHelper(coins, amount, dp);
        System.out.println("递归调用次数：" + count); // 输出递归调用次数
        return result;
    }

    private int coinChangeHelper(int[] coins, int amount, int[] dp) {
        count++; // 每次递归调用时增加计数
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        if (dp[amount] != amount + 1) return dp[amount];
        for (int coin : coins) {
            if (amount - coin >= 0) {
                dp[amount] = Math.min(dp[amount], coinChangeHelper(coins, amount - coin, dp) + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Let322more let322 = new Let322more();
        int i = let322.coinChange(new int[]{186,419,83,408}, 6249);
        int[] ints = let322.dp;
        for (int i1 = 0; i1 < ints.length; i1++) {
            if(ints[i1]!=6250) System.out.printf(i1+"---->"+ints[i1]);
        }
        System.out.printf(let322.count+"__"+i);
    }

}
