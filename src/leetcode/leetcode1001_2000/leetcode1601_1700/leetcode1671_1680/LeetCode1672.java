package leetcode.leetcode1001_2000.leetcode1601_1700.leetcode1671_1680;

public class LeetCode1672 {

	public int maximumWealth(int[][] accounts) {

		int res = 0;
		for (int i = 0; i < accounts.length; i++) {
			res = res > maximumWealth(accounts[i]) ? res : maximumWealth(accounts[i]);
		}
		return res;
	}

	public int maximumWealth(int[] accounts) {

		int res = 0;
		for (int i = 0; i < accounts.length; i++) {
			res += accounts[i];
		}
		return res;
	}
}
