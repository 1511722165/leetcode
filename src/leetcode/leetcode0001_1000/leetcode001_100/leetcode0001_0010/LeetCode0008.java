package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

public class LeetCode0008 {
	public int myAtoi(String s) {
		char[] cs = s.trim().toCharArray();
		if (cs.length == 0) {
			return 0;
		} else if (cs[0] == '+' || cs[0] == '-') {
			return 0;
		} else if (cs[0] > '0' && cs[0] < '9') {
			return 0;
		} else {
			return 0;
		}
	}
}
