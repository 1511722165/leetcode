package leetcode.leetcode0001_1000.leetcode101_200.leetcode0121_0130;

public class LeetCode0125 {
	public boolean isPalindrome(String s) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if ('9' >= c[i] && c[i] >= '0') {
				sb1.append(c[i]);
				sb2.insert(0, c[i]);
			} else if ('Z' >= c[i] && c[i] >= 'A') {
				sb1.append(c[i]);
				sb2.insert(0, c[i]);
			} else if ('z' >= c[i] && c[i] >= 'a') {
				sb1.append((char) (c[i] - 32));
				sb2.insert(0, (char) (c[i] - 32));
			}
		}
		if ("".equals(sb1.toString())) {
			return true;
		}

		if (sb1.toString().equals(sb2.toString())) {
			return true;
		}
		return false;

	}

	// RACEACAR
	// RACEACAR
	public static void main(String[] args) {
		LeetCode0125 demo = new LeetCode0125();
		demo.isPalindrome("race a car");
	}
}
