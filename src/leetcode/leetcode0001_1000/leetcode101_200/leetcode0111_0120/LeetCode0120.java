package leetcode.leetcode0001_1000.leetcode101_200.leetcode0111_0120;

import java.util.Arrays;
import java.util.List;

public class LeetCode0120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 0; i < m - 1; i++) {
            Arrays.fill(dp[i + 1], Integer.MAX_VALUE);
            for (int j = 0; j <= i; j++) {
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + triangle.get(i + 1).get(j));
                dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + triangle.get(i + 1).get(j + 1));
            }
        }
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            max = Math.min(max, dp[m - 1][i]);
        }
        return max;
    }
}
