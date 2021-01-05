package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1221_1230;

public class LeetCode1221 {

	public int balancedStringSplit(String s) {
		int f = 0, r = 0, res = 0;
		char c = 'R';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				f++;
			} else {
				r++;
			}
			if (r == f) {
				res++;
				r = 0;
				f = 0;
			}
		}
		return res;
	}

}
