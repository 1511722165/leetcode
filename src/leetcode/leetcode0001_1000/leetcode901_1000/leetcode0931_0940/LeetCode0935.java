package leetcode.leetcode0001_1000.leetcode901_1000.leetcode0931_0940;

public class LeetCode0935 {
    public static int mod = 1000000007;

    public int knightDialer1(int n) {
        if (n == 1) return 10;
        long[][] dp = new long[10][n];
        for (int i = 0; i < 10; i++) {
            if (i != 5) {
                dp[i][n - 1] = 1;
            }
        }
        n--;
        while (n >= 1) {
            dp[0][n - 1] = (dp[4][n] + dp[6][n]) % mod;
            dp[1][n - 1] = (dp[8][n] + dp[6][n]) % mod;
            dp[2][n - 1] = (dp[7][n] + dp[9][n]) % mod;
            dp[3][n - 1] = (dp[4][n] + dp[8][n]) % mod;
            dp[4][n - 1] = (dp[0][n] + dp[3][n] + dp[9][n]) % mod;
            dp[6][n - 1] = (dp[1][n] + dp[7][n] + dp[0][n]) % mod;
            dp[7][n - 1] = (dp[2][n] + dp[6][n]) % mod;
            dp[8][n - 1] = (dp[1][n] + dp[3][n]) % mod;
            dp[9][n - 1] = (dp[2][n] + dp[4][n]) % mod;
            n--;
        }
        long res = 0;
        for (int i = 0; i <= 9; i++) {
            res += dp[i][0];
        }
        return (int) (res%mod);
    }


    private static final int MOD = 1_000_000_007;
    private static final int [][] NEXT = {
            {4, 6}, {6, 8}, {7, 9}, {4, 8},{0, 3, 9}, {}, {0, 1, 7}, {2, 6}, {1, 3}, {2, 4}
    };
    private static final int[][] memo = new int[5000][10];

    public int knightDialer(int n) {
        if (n == 1) {
            return 10;
        }
        int ans = 0;
        for (int j = 0; j < 10; j++) {
            ans = (ans + dfs(n - 1, j)) % MOD;
        }
        return ans;
    }

    private int dfs(int i, int j) {
        if (i == 0) {
            return 1;
        }
        if (memo[i][j] > 0) {
            return memo[i][j];
        }
        int res = 0;
        for (int k : NEXT[j]) {
            res = (res + dfs(i - 1, k)) % MOD;
        }
        return memo[i][j] = res;
    }

    public static void main(String[] args) {
        LeetCode0935 demo = new LeetCode0935();
        System.out.println(demo.knightDialer(3));
    }
}
