package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1821_1830;

public class LeetCode1822 {
	public char firstUniqChar(String s) {
		char c = ' ';
		int index = -1;
		for (int i = 0; i < 26; i++) {
			if (s.indexOf((char) (i + 97)) == s.lastIndexOf((char) (i + 97)) && s.indexOf((char) (i + 97)) >= 0) {
				if (c == ' ') {
					index = s.indexOf((char) (i + 97));
					c = (char) (i + 97);
				} else if (index > s.indexOf((char) (i + 97))) {
					index = s.indexOf((char) (i + 97));
					c = (char) (i + 97);
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		LeetCode1822 demo = new LeetCode1822();
		demo.firstUniqChar("leetcode");
	}
}
