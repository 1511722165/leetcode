package leetcode.leetcode0001_1000.leetcode001_100.leetcode0061_0070;

public class LeetCode0067 {

	public String addBinary(String a, String b) {
		if (a.length() >= b.length()) {
			return addBinaryformat(new StringBuilder(), a.toCharArray(), b.toCharArray(), 0, a.length(), b.length());

		} else {
			return addBinaryformat(new StringBuilder(), b.toCharArray(), a.toCharArray(), 0, b.length(), a.length());
		}
	}

	public String addBinaryformat(StringBuilder sb, char[] cb, char[] ca, int flag, int bl, int al) {

		for (int i = 0; i < bl; i++) {
			if (al - i - 1 >= 0) {
				if (ca[al - 1 - i] == cb[bl - 1 - i] && ca[al - 1 - i] == '1') {

					if (flag == 1) {
						sb.insert(0, '1');

					} else {
						sb.insert(0, '0');
						flag = 1;
					}

				} else if (ca[al - 1 - i] == cb[bl - 1 - i] && ca[al - 1 - i] == '0') {
					if (flag == 1) {
						sb.insert(0, '1');
						flag = 0;

					} else {
						sb.insert(0, '0');
					}

				} else {

					if (flag == 1) {
						sb.insert(0, '0');
						flag = 1;

					} else {
						sb.insert(0, '1');
					}

				}

			} else {

				if (cb[bl - 1 - i] == '1') {
					if (flag == 1) {
						sb.insert(0, '0');
						flag = 1;

					} else {
						sb.insert(0, '1');
					}

				} else {
					if (flag == 1) {
						sb.insert(0, '1');
						flag = 0;

					} else {
						sb.insert(0, '0');
					}

				}

			}
		}
		if (flag == 1)
			sb.insert(0, '1');
		return sb.toString();

	}

	public static void main(String[] args) {
		LeetCode0067 demo = new LeetCode0067();
		demo.addBinary("110010", "10111");
	}
}
