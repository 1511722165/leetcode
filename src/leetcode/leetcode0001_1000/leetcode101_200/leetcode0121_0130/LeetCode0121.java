package leetcode.leetcode0001_1000.leetcode101_200.leetcode0121_0130;

public class LeetCode0121 {

	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}
		int max = 0;
		int min = prices[0];
		for (int i = 1; i < prices.length; i++) {
			// min = Math.min(min, prices[i - 1]);
			min = min > prices[i - 1] ? prices[i - 1] : min;
			// max = Math.max(prices[i] - min, max);
			max = max > prices[i] - min ? max : prices[i] - min;

		}
		return max;
	}

	public static void main(String[] args) {
		LeetCode0121 demo = new LeetCode0121();
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		demo.maxProfit(prices);

	}
}
