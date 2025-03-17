package leetcode.leetcode1001_2000.leetcode1101_1200.leetcode1131_1140;

public class LeetCode1137 {

    public int tribonacci(int n) {
        if (n < 2) return n;
        if (n == 2) return n - 1;
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        int i = 3;
        while (i <= n) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            ++i;
        }
        return dp[n];
    }
}
