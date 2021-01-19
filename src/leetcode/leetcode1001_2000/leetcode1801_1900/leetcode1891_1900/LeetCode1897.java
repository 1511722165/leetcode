package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1891_1900;

public class LeetCode1897 {
	public int trailingZeroes(int n) {
		int count = 0;
		while (n >= 5) {
			count += n / 5;
			n /= 5;
		}
		return count;
    }
}
