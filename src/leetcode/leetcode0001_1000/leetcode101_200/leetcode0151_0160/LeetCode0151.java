package leetcode.leetcode0001_1000.leetcode101_200.leetcode0151_0160;

public class LeetCode0151 {
//	public String reverseWords(String s) {
//		String[] sc = s.split(" ");
//		StringBuilder sb = new StringBuilder();
//		for (int i = sc.length - 1; i >= 0; i--) {
//			if (sc[i].length() > 0) {
//				sb.append(sc[i] + " ");
//			}
//		}
//		return sb.toString().trim();
//	}

	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		getReverseWords(s, sb, 0, false);
		return sb.toString();
	}

	private void getReverseWords(String s, StringBuilder sb, int start, boolean flag) {
		// 跳过空格
		while (start < s.length() && s.charAt(start) == ' ') {
			start++;
		}
		if (start == s.length()) {
			return;
		}

		// 获取单词，并递归
		int end = start;
		while (end < s.length() && s.charAt(end) != ' ') {
			end++;
		}
		getReverseWords(s, sb, end, true);

		// 递归回来后，插入本位置对应单词
		sb.append(s.substring(start, end));

		// flag为true时，插入单词后再插入空格
		if (flag)
			sb.append(" ");
	}
}
