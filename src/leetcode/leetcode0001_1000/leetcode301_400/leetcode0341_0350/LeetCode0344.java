package leetcode.leetcode0001_1000.leetcode301_400.leetcode0341_0350;

public class LeetCode0344 {
	// public void reverseString(char[] s) {
	// s = new StringBuilder(new String(s)).reverse().toString().toCharArray();
	// }

	public void reverseString(char[] s) {
		char cr;
		for (int i = 0; i < s.length / 2; i++) {
			cr = s[s.length - 1 - i];
			s[s.length - 1 - i] = s[i];
			s[i] = cr;
		}
	}

	public static void main(String[] args) {
		LeetCode0344 demo = new LeetCode0344();
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		demo.reverseString(s);
	}
}
