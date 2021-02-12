package leetcode.leetcode0001_1000.leetcode101_200.leetcode0121_0130;

public class LeetCode0122 {
	public int maxProfit(int[] prices) {
		int res = 0;
		int start = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > start) {
				res = res + prices[i] - start;
				start = prices[i];
			} else {
				start = prices[i];
			}
		}
		return res;
	}
}
