package leetcode.leetcode0001_1000.leetcode201_300.leetcode0221_0230;

public class LeetCode0221 {

    private int max;
    private int[][] dp;
    private int m;
    private int n;

    public int maximalSquare(char[][] matrix) {
        max = 0;
        m = matrix.length;
        n = matrix[0].length;
        dp = new int[m][n];
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == '1') dp[0][j] = 1;

        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = dp[i - 1][j] + 1;
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                this.calMax(i, j);
            }
        }

        return max * max;
    }


    private void calMax(int i, int j) {
        // 大于才计算
        if (dp[i][j] > 0 && i + 1 > max && j + 1 > max && dp[i][j] > max) {
            //可能最大
            int mayMax = Math.min(dp[i][j], j + 1);

            while (mayMax > max) {
                boolean flag = true;
                for (int a = j; a > j - mayMax; a--) {
                    if (dp[i][a] < mayMax) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    max = Math.max(max, mayMax);
                }
                --mayMax;
            }
        }
    }

    public static void main(String[] args) {
        LeetCode0221 demo = new LeetCode0221();
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        demo.maximalSquare(matrix);
    }

}
