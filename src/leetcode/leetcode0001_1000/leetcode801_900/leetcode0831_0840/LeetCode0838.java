package leetcode.leetcode0001_1000.leetcode801_900.leetcode0831_0840;

public class LeetCode0838 {
    private static char[] chars = new char[]{'L', 'R', '.'};

    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[][] dp = new int[2][n];
        char[] cs = dominoes.toCharArray();
        for (int i = 0; i < n; i++) {
            if (cs[i] == chars[0]) {
                dp[1][i] = -1;
                dp[0][i] = -1;
            } else if (cs[i] == chars[1]) {
                dp[1][i] = 1;
                dp[0][i] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            //从左往右
            if (dp[0][i] == 0 && dp[0][i - 1] > 0) {
                dp[0][i] = dp[0][i - 1] + 1;
            }
            //从右往左
            if (dp[1][n - i - 1] == 0 && dp[1][n - i] < 0) {
                dp[1][n - i - 1] = dp[1][n - i] - 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        //从右往左
        for (int i = 0; i < n; i++) {

            if (cs[i] == chars[0]) {
                sb.append(chars[0]);
            } else if (cs[i] == chars[1]) {
                sb.append(chars[1]);
            } else {
                if (dp[0][i] == 0 && dp[1][i] < 0) {
                    sb.append(chars[0]);
                } else if (dp[1][i] == 0 && dp[0][i] > 0) {
                    sb.append(chars[1]);
                } else if (dp[0][i] + dp[1][i] > 0) {
                    sb.append(chars[0]);
                } else if (dp[0][i] + dp[1][i] < 0) {
                    sb.append(chars[1]);
                } else {
                    sb.append(chars[2]);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LeetCode0838 demo = new LeetCode0838();
        demo.pushDominoes(".L.R...LR..L..");
    }
}
