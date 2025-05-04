package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1001_1010;

public class LeetCode1007 {

    public int minDominoRotations(int[] tops, int[] bottoms) {
        int x = tops[0], y = bottoms[0];
        int n = tops.length;
        int dp[][] = new int[4][n];
        //dp[0] top存放x dp[1] top存放y dp[2] bottoms存放x dp[3] bottoms存放y
        if (x == y) {
            y = 0;
        } else {
            dp[1][0] = 1;
            dp[2][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (tops[i] == x) {
                dp[0][i] = dp[0][i - 1];
                if (bottoms[i] == x) {
                    dp[2][i] = dp[2][i - 1];
                    dp[1][i] = -2;
                    dp[3][i] = -2;
                    y = 0;
                } else if (bottoms[i] == y) {
                    dp[2][i] = dp[2][i - 1] + 1;
                    dp[1][i] = dp[1][i - 1] + 1;
                    dp[3][i] = dp[3][i - 1];
                } else {
                    dp[2][i] = dp[2][i - 1] + 1;
                    dp[1][i] = -2;
                    dp[3][i] = -2;
                    y = 0;
                }
            } else if (tops[i] == y) {
                dp[1][i] = dp[1][i - 1];
                if (bottoms[i] == x) {
                    dp[0][i] = dp[0][i - 1] + 1;
                    dp[2][i] = dp[2][i - 1];
                    dp[3][i] = dp[3][i - 1] + 1;
                } else if (bottoms[i] == y) {
                    dp[0][i] = -2;
                    dp[2][i] = -2;
                    dp[3][i] = dp[3][i - 1];
                    x = 0;
                } else {
                    dp[0][i] = -2;
                    dp[2][i] = -2;
                    dp[3][i] = dp[3][i - 1] + 1;
                    x = 0;
                }
            } else {
                if (bottoms[i] == x) {
                    dp[0][i] = dp[0][i - 1] + 1;
                    dp[1][i] = -2;
                    dp[2][i] = dp[2][i - 1];
                    dp[3][i] = -2;
                    y = 0;
                } else if (bottoms[i] == y) {
                    dp[0][i] = -2;
                    dp[1][i] = dp[1][i - 1] + 1;
                    dp[2][i] = -2;
                    dp[3][i] = dp[3][i - 1];
                    x = 0;
                } else {
                    return -1;
                }
            }
        }

        int ans = n;
        if (dp[0][n - 1] >= 0) ans = Math.min(ans, dp[0][n - 1]);
        if (dp[1][n - 1] >= 0) ans = Math.min(ans, dp[1][n - 1]);
        if (dp[2][n - 1] >= 0) ans = Math.min(ans, dp[2][n - 1]);
        if (dp[3][n - 1] >= 0) ans = Math.min(ans, dp[3][n - 1]);
        return ans;
    }

    public static void main(String[] args) {
        LeetCode1007 demo = new LeetCode1007();
        int[] tops = new int[]{1, 1, 2, 1};
        int[] bottoms = new int[]{1, 2, 1, 1};
        demo.minDominoRotations(tops, bottoms);
    }
}
