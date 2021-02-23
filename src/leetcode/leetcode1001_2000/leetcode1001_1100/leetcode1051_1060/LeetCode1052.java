package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1051_1060;

public class LeetCode1052 {
	public int maxSatisfied(int[] customers, int[] grumpy, int X) {
		int res = 0;
		for (int i = 0; i < customers.length; i++) {
			if (grumpy[i] == 0) {
				res += customers[i];
				customers[i] = 0;
			}
		}
		int count = 0;
		int max = 0;
		for (int i = 0; i < X; i++) {
			max += customers[i];
		}
		count = max;
		for (int i = 1; i + X-1 < customers.length; i++) {
			count = count - customers[i - 1] + customers[i + X - 1];
			max = Math.max(max, count);
		}
		return res + max;
	}

	public static void main(String[] args) {
		LeetCode1052 demo = new LeetCode1052();
		int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
		int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
		int X = 3;
		demo.maxSatisfied(customers, grumpy, X);
	}
}
