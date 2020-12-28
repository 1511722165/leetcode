package leetcode.leetcode0001_1000.leetcode001_100.leetcode0011_0020;

public class LeetCode0013 {

	public int romanToInt(String s) {
		int res = 0;
		char[] cs = (s+"A").toCharArray();
		for (int i = 0; i < cs.length - 1; i++) {

			if (cs[i] == 'M') {
				res += 1000;
			} else if (cs[i] == 'D') {
				res += 500;
			} else if (cs[i] == 'V') {
				res += 5;
			} else if (cs[i] == 'L') {
				res += 50;
			} else if (cs[i] == 'I') {
				if (cs[i + 1] != 'V' && cs[i + 1] != 'X') {

					res += 1;
				} else {
					res -= 1;
				}
			} else if (cs[i] == 'X') {
				if (cs[i + 1] != 'L' && cs[i + 1] != 'C') {

					res += 10;
				} else {
					res -= 10;
				}
			} else if (cs[i] == 'C') {
				if (cs[i + 1] != 'D' && cs[i + 1] != 'M') {

					res += 100;
				} else {
					res -= 100;
				}
			}

		}
		return res;
	}
	public static void main(String[] args) {
		LeetCode0013 demo =new LeetCode0013();
		System.out.println(demo.romanToInt("MDCCCLXXXIV"));
	}
}
