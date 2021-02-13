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
		// �����ո�
		while (start < s.length() && s.charAt(start) == ' ') {
			start++;
		}
		if (start == s.length()) {
			return;
		}

		// ��ȡ���ʣ����ݹ�
		int end = start;
		while (end < s.length() && s.charAt(end) != ' ') {
			end++;
		}
		getReverseWords(s, sb, end, true);

		// �ݹ�����󣬲��뱾λ�ö�Ӧ����
		sb.append(s.substring(start, end));

		// flagΪtrueʱ�����뵥�ʺ��ٲ���ո�
		if (flag)
			sb.append(" ");
	}
}
