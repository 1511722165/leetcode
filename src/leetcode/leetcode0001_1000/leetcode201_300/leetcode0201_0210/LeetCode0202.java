package leetcode.leetcode0001_1000.leetcode201_300.leetcode0201_0210;

public class LeetCode0202 {

	// public boolean isHappy(int n) {
	// int flag = (int) Math.sqrt(n);
	// int tep = 0;
	// for (int i = 0; i <= flag; i++) {
	// for (int j = i; j <= flag; j++) {
	// tep = (int) Math.sqrt(n - 2 * i * j);
	// if (n - 2 * i * j == tep * tep) {
	// return true;
	// }
	// }
	// }
	// return false;
	// }

	public boolean isHappy(int n) {
		int tmp = n;
		while (n > 9) {
			tmp = n;
			n = 0;
			while (tmp > 0) {
				n += (int) Math.pow(tmp % 10, 2);
				tmp /= 10;

			}

		}
		if (n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 8 || n == 9) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		LeetCode0202 demo = new LeetCode0202();
		demo.isHappy(19);
	}
}
