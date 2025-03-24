package leetcode.leetcode0001_1000.leetcode301_400.leetcode0301_0310;

import java.util.Arrays;

public class LeetCode0309 {

    //    public int maxProfit(int[] prices) {
//        int n=prices.length;
//        int dp[][]=new int[n][n];
//        int ans=0;
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                dp[i][j]=prices[j]-prices[i];
//            }
//        }
//
//
//        for (int i=0;i<n;i++) {
//            System.out.println(Arrays.toString(dp[i]));
//        }
//        return ans;
//    }
//    此题展现出来的维度有三个。思路是先降维，将买、卖、冷冻，降维成两个维度：持有股票和未持有股票。
//    持有股票：今天买入和之前买入但未卖出
//    未持有：今天卖出和冷冻期
//    所以有的传递式：
//    hold[i]=max(hold[i-1],notHold[i-2]-prices[i]); 意思是当前持有的股票的最大收益是昨天持有的股票（可能今天并未有任何操作）和之前卖出的最大收益-今天买入的(i-2的意思是今天买入的话，昨天就应该是冷冻期)。
//    notHold[i]=max(notHold[i-1],hold[i-1]+prices[i]);最大收益的就很容易理解。
//
//    用此思路也可以解决上一个最佳买卖股票题型。可能我们都能直到这题的解决方法，难点就在于如何找到解决公式
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        int[] hold = new int[n];
        hold[0] = -prices[0];
        int[] notHold = new int[n];
        for (int i = 1; i < n; i++) {
            if (i >= 2) hold[i] = Math.max(hold[i - 1], notHold[i - 2] - prices[i]);
            else hold[i] = Math.max(hold[i - 1], -prices[i]);
            notHold[i] = Math.max(notHold[i - 1], hold[i - 1] + prices[i]);
        }
        return notHold[n - 1];
    }

    public static void main(String[] args) {
        LeetCode0309 demo = new LeetCode0309();
        demo.maxProfit(new int[]{1, 2, 3, 0, 2});
    }
}
