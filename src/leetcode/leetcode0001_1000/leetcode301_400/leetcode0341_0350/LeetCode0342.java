package leetcode.leetcode0001_1000.leetcode301_400.leetcode0341_0350;

public class LeetCode0342 {
	public boolean isPowerOfFour(int n) {
		if (n <= 0) {
			return false;
		}
		int temp = 0;
		while (n > 1) {
			if (n == 1 || n == 4) {
				return true;
			} else if ((4 > n && n > 1)) {
				return false;
			}
			temp = n;
			n = n >> 2;
			if (temp != n << 2) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		LeetCode0342 demo = new LeetCode0342();
		demo.isPowerOfFour(64);
	}

}
