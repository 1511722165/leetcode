package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3171_3180;

import java.util.Arrays;

public class LeetCode3180 {

    public int maxTotalReward(int[] rew) {
        // 排序 + 01背包变形
        Arrays.sort(rew);
        int n = rew.length, mx = rew[n - 1], ans = -1;
        boolean[] dp = new boolean[mx * 2];
        // 总和0可以取到(不选任何值)。
        dp[0] = true;
        for(int x : rew){
            // 枚举总和。若选x，则之前最大可用和为x - 1，即选x可尝试获得的最大总和为x * 2 - 1(选x时之前总和必须小于x)。
            for(int j = x; j < x * 2; ++j){
                if(dp[j] |= dp[j - x]){
                    ans = j > ans ? j : ans;
                }
            }
        }
        return ans;
    }
}
