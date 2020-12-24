package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1711_1720;

public class LeetCode1714 {

	public int calculate(String s) {
		int x = 1;
		int y = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 65) {
				x = A(x, y);
			} else {
				y = B(x, y);
			}
		}

		return x + y;
	}

	public int A(int x, int y) {
		return 2 * x + y;

	}

	public int B(int x, int y) {
		return 2 * y + x;
	}

}
