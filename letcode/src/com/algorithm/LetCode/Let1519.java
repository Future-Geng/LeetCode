package com.algorithm.LetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Let1519 {

    public static void main(String[] args) {
        new Let1519().countSubTrees(4,new int[][]{{0,1},{1,2},{0,3}},"bbbb");
        System.out.println("---");
    }


    char[] cs;
    int[] ans;
    List<Integer>[] g;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        cs = labels.toCharArray();
        g = new List[n];
        ans = new int[n];
        Arrays.setAll(g, k -> new ArrayList<>());
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        dfs(0, -1);
        return ans;
    }

    int[] dfs(int node, int pre) {
        int[] cnt = new int[26];
        for (int ne : g[node]) {
            if (ne != pre) {
                int[] res = dfs(ne, node);
                for (int i = 0; i < 26; i++) cnt[i] += res[i];
            }
        }
        ans[node] = ++cnt[cs[node] - 'a'];
        return cnt;
    }

}
