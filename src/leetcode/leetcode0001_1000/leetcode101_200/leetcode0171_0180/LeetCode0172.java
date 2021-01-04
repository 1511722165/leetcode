package leetcode.leetcode0001_1000.leetcode101_200.leetcode0171_0180;

public class LeetCode0172 {

	public int trailingZeroes(int n) {
		int count = 0;
		while (n >= 5) {
			count += n / 5;
			n /= 5;
		}
		return count;
	}
}
