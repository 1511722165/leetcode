package leetcode.leetcode0001_1000.leetcode001_100.leetcode0061_0070;

public class LeetCode0063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //有障碍物
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    //无障碍物 等于上面+左边
                    if (i >= 1) {
                        dp[i][j] = dp[i - 1][j];
                    }
                    if (j >= 1) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
