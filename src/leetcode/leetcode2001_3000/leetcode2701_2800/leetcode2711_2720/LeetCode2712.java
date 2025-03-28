package leetcode.leetcode2001_3000.leetcode2701_2800.leetcode2711_2720;

public class LeetCode2712 {

    public long minimumCost(String s) {
        int n = s.length();
        if (n == 1) return 0l;
        long[][] dp = new long[n][2];
        char[] cs = s.toCharArray();

        int mid = n / 2;
        int left = 1;
        int right = n - 2;
        //初始化 left right
        if (cs[0] == '0') {
            dp[0][1] = 1l;
        } else {
            dp[0][0] = 1l;
        }
        if (cs[n - 1] == '0') {
            dp[n - 1][1] = 1l;
        } else {
            dp[n - 1][0] = 1l;
        }


        while (left < mid) {
            if (cs[left] == '0') {
                dp[left][1] = dp[left - 1][0] + left + 1;
                dp[left][0] = dp[left - 1][0];
            } else {
                dp[left][1] = dp[left - 1][1];
                dp[left][0] = dp[left - 1][1] + left + 1;
            }
            ++left;
        }

        while (right >= mid) {
            if (cs[right] == '0') {
                dp[right][1] = dp[right + 1][0] + n - right;
                dp[right][0] = dp[right + 1][0];
            } else {
                dp[right][1] = dp[right + 1][1];
                dp[right][0] = dp[right + 1][1] + n - right;
            }
            --right;
        }
        return Math.min(dp[mid][0] + dp[mid - 1][0], dp[mid][1] + dp[mid - 1][1]);
    }

    public static void main(String[] args) {
        LeetCode2712 demo = new LeetCode2712();
//        System.out.println(demo.minimumCost("0011"));
        System.out.println(demo.minimumCost("000000001"));
    }
}
