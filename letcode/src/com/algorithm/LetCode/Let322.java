package com.algorithm.LetCode;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Let322 {
    //dp[n] = min(res,dp[n-coin]+1);

    Map<Integer,Integer> map;

    int count = 0;

    public int coinChange(int[] coins, int amount) {
        map = new HashMap<>();
        int flag = amount+1;
        for (int i = 1; i <=flag; i++) {
            map.put(i,flag);
        }
        map.put(0,0);
        return dp(coins,amount,flag);
    }


    public int dp(int[] coins,int amount,int flag){
        count++;
        if (amount==0)return 0;
        if (amount<0)return -1;
        if (map.get(amount)!=amount+1)return map.get(amount);
        for (int coin:coins) {
            if (amount-coin<0)continue;
            map.put(amount,Math.min(map.get(amount),dp(coins,amount-coin,flag)+1));
        }
        return map.get(amount)==flag?-1:map.get(amount);
    }

    public static void main(String[] args) {
        Let322 let322 = new Let322();
        int i = let322.coinChange(new int[]{186,419,83,408}, 6249);
        HashSet<Object> objects = new HashSet<>( let322.map.keySet());
        System.out.printf(let322.count+"__"+i);
    }

}
