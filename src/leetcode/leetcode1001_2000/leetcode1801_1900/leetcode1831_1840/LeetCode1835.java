package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1831_1840;

public class LeetCode1835 {
	public String reverseLeftWords(String s, int n) {
		return s.substring(n, s.length()) + s.substring(0, n);
	}

	public static void main(String[] args) {
		LeetCode1835 demo = new LeetCode1835();
		System.out.println(demo.reverseLeftWords("abcdefg", 2));
	}
}
