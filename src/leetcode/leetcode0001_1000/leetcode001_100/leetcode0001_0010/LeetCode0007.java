package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

public class LeetCode0007 {

	public int reverse(int x) {
		long res = 0;
		int p = 0;
		if (x < 0) {
			x = Math.abs(x);
			while (x > 0) {
				p = x % 10;
				res = res * 10 + p;
				x = x / 10;
			}
			if (res-1 > 2147483647) {
				return 0;
			}
			return Math.abs((int) res) * -1;

		} else {

			while (x > 0) {
				p = x % 10;
				res = res * 10 + p;

				x = x / 10;
			}
			if (res > 2147483647) {
				return 0;
			}
			return Math.abs((int) res);
		}

	}

	public static void main(String[] args) {
		LeetCode0007 demo = new LeetCode0007();
//		int x = -1534236469;
		 int x=-124;
		System.out.println(demo.reverse(x));
	}

}
