package leetcode.leetcode0001_1000.leetcode201_300.leetcode0231_0240;

public class LeetCode0231 {

	public boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return Boolean.FALSE;
		} else if (n == 1) {
			return Boolean.TRUE;
		}
		int temp = 0;
		while (n > 1) {
			if (n == 1 || n == 2) {
				return true;
			}
			temp = n;
			n = n >> 2;
			if (temp != n << 2) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	public static void main(String[] args) {
		LeetCode0231 demo = new LeetCode0231();
		demo.isPowerOfTwo(16);
	}
}
