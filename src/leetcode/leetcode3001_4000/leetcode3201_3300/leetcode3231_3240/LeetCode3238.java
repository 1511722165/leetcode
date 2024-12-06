package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3231_3240;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode3238 {

    public int winningPlayerCount(int n, int[][] pick) {
        int[][] dp = new int[n][11];
        boolean[] ans = new boolean[n];
        int res = 0;
        for (int[] p : pick) {
            if (!ans[p[0]]) {
                dp[p[0]][p[1]]++;
                if (dp[p[0]][p[1]] > p[0]) {
                    res++;
                    ans[p[0]] = true;
                }
            }
        }
        return res;
    }
}
