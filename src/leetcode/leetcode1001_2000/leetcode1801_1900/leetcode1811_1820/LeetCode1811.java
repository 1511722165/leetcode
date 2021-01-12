package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1811_1820;

public class LeetCode1811 {

	public String reverseWords(String s) {
		String[] sc = s.split(" ");
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append(sc[sc.length - 1]);
		for (int i = sc.length - 2; i >= 0; i--) {
			sbBuilder.append(" " + sc[i]);
		}
		if (s.charAt(0) == ' ') {
			sbBuilder.append(' ');
		}
		return sbBuilder.toString();
	}
	public static void main(String[] args) {
		LeetCode1811 demo =new LeetCode1811();
		demo.reverseWords("  hello world!  ");
	}
}
