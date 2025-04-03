package leetcode.leetcode2001_3000.leetcode2101_2200.leetcode2131_2140;

public class LeetCode2140 {

    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long dp[] = new long[n];
        dp[n - 1] = questions[n - 1][0];
        for (int i = n - 2; i >= 0; i--) {
            int v = questions[i][0];
            int skip = questions[i][1];

            if (i + skip+1 < n) {
                dp[i] = v + dp[i + skip+1];
            } else {
                dp[i] = v;
            }
            dp[i] = Math.max(dp[i + 1], dp[i]);

        }
        return dp[0];
    }

    public static void main(String[] args) {
        LeetCode2140 demo=new LeetCode2140();
        demo.mostPoints(new int[][]{{1000,1},{1000,1},{1000,1},{1000,1}});
    }
}
