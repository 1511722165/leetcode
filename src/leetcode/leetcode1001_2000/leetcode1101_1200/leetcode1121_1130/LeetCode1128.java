package leetcode.leetcode1001_2000.leetcode1101_1200.leetcode1121_1130;

public class LeetCode1128 {

    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] dp = new int[10][10];
        int ans = 0;
        for (int[] domino : dominoes) {
            ++dp[domino[0]][domino[1]];
        }
        for (int i = 1; i < 10; i++) {
            ans += dp[i][i] * (dp[i][i] - 1) / 2;
            for (int j = i + 1; j < 10; j++) {
                ans += (dp[i][j] + dp[j][i]) * (dp[i][j] + dp[j][i] - 1) / 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode1128 leetCode1128 = new LeetCode1128();
        int[][] dominoes = new int[][]{{1, 1}, {2, 2}, {1, 1}, {1, 2}, {1, 2}, {1, 1}};
        leetCode1128.numEquivDominoPairs(dominoes);
    }
}
