package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

public class LeetCode0006 {
	public String convert(String s, int numRows) {
		if (s.length() <= numRows || numRows == 1) {
			return s;
		}
		char[] cs = s.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			if (i == 0 || i == numRows - 1) {
				for (int j = i; j < cs.length;) {
					stringBuilder.append(cs[j]);
					j = j + 2 * (numRows - 1);
				}
			} else {
				int tmp = numRows - 1;
				for (int j = i; j < cs.length;) {
					stringBuilder.append(cs[j]);
					if (2 * tmp - j < cs.length) {
						stringBuilder.append(cs[2 * tmp - j]);
					}
					j = j + 2 * (numRows - 1);
					tmp = tmp + 2 * (numRows - 1);
				}

			}
		}
		return stringBuilder.toString();
	}
}
