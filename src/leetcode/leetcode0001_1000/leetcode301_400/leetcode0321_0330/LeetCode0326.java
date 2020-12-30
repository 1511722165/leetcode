package leetcode.leetcode0001_1000.leetcode301_400.leetcode0321_0330;

import sun.applet.Main;

public class LeetCode0326 {

	public boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return Boolean.FALSE;
		} else if (n == 1) {
			return Boolean.TRUE;
		}
		double temp = n;
		n=n>>2;
		while (temp > 1) {
			if (temp == 1 || temp == 3||temp == 9) {
				return Boolean.TRUE;
			} else if (temp > 1&& temp < 9) {
				return Boolean.FALSE;
			}
			temp = Math.pow(temp, 1.0 / 3);
		}
		return Boolean.TRUE;
	}

	public static void main(String[] args) {
		LeetCode0326 demo = new LeetCode0326();
		demo.isPowerOfThree(81);
	}
}
