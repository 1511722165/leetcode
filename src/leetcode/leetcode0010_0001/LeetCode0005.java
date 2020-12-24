package leetcode.leetcode0010_0001;

public class LeetCode0005 {

	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		// 保存起始位置，测试了用数组似乎能比全局变量稍快一点
		int[] range = new int[2];
		char[] str = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			// 把回文看成中间的部分全是同一字符，左右部分相对称
			// 找到下一个与当前字符不同的字符
			i = findLongest(str, i, range);
		}
		return s.substring(range[0], range[1] + 1);
	}

	public static int findLongest(char[] str, int low, int[] range) {
		// 查找中间部分
		int high = low;
		while (high < str.length - 1 && str[high + 1] == str[low]) {
			high++;
		}
		// 定位中间部分的最后一个字符
		int ans = high;
		// 从中间向左右扩散
		while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
			low--;
			high++;
		}
		// 记录最大长度
		if (high - low > range[1] - range[0]) {
			range[0] = low;
			range[1] = high;
		}
		return ans;
	}

	// public String longestPalindrome(String s) {
	//
	// if (s.equals(new StringBuffer(s).reverse().toString())) {
	// return s;
	// }
	// char[] last = new char[128];
	// for (int i = 0; i < 128; i++) {
	// last[i] = (char) i;
	// }
	// int res = 0;
	// int n = s.length();
	// String result = "";
	//
	// int end = s.charAt(n - 1);
	// for (int i = 48; i < 123; i++) {
	// if ((i >= 58 && i <= 64) || (i >= 91 && i <= 96)) {
	//
	// } else {
	// String temp = last[i] + "";
	// if (i == 123 || i == 124 || (i >= 40 && i <= 44) || i == 63 || i == 91 ||
	// i == 92) {
	// temp = "\\" + last[i];
	// }
	// String[] strs = s.split(temp);
	// if (end == i) {
	// int h = 0;
	// for (int k = s.length() - 1; k >= 0; k--) {
	// if (s.charAt(k) == i) {
	// h++;
	// } else {
	// break;
	// }
	//
	// }
	// String[] strs1 = new String[strs.length + h - 1];
	// for (int k = 0; k < strs.length; k++) {
	// strs1[k] = strs[k];
	// }
	// for (int k = 0; k < h - 1; k++) {
	// strs1[strs.length + k] = "";
	//
	// }
	// if (strs1.length > 1) {
	//
	// for (int j = 1; j < strs1.length; j++) {
	// StringBuilder str = new StringBuilder();
	// str.append(last[i] + strs1[j] + last[i]);
	// StringBuilder reverse = new StringBuilder(str);
	// if (str.length() > res &&
	// str.toString().equals(reverse.reverse().toString())) {
	// res = str.length();
	// result = str.toString();
	// }
	// for (int k = j + 1; k < strs1.length; k++) {
	// str.append(strs1[k] + last[i]);
	// reverse = new StringBuilder(str);
	// if (str.length() > res &&
	// str.toString().equals(reverse.reverse().toString())) {
	// res = str.length();
	// result = str.toString();
	// }
	// }
	//
	// }
	//
	// }
	// } else {
	// if (strs.length > 2) {
	// for (int j = 1; j < strs.length - 1; j++) {
	// StringBuilder str = new StringBuilder();
	// str.append(last[i] + strs[j] + last[i]);
	// StringBuilder reverse = new StringBuilder(str);
	// if (str.length() > res &&
	// str.toString().equals(reverse.reverse().toString())) {
	// res = str.length();
	// result = str.toString();
	// }
	// for (int k = j + 1; k < strs.length - 1; k++) {
	// str.append(strs[k] + last[i]);
	// reverse = new StringBuilder(str);
	// if (str.length() > res &&
	// str.toString().equals(reverse.reverse().toString())) {
	// res = str.length();
	// result = str.toString();
	// }
	// }
	//
	// }
	//
	// }
	// }
	// }
	// }
	// return "".equals(result) ? s.charAt(0) + "" : result;
	// }

	public static void main(String[] args) {
		LeetCode0005 demo = new LeetCode0005();
		String s = demo.longestPalindrome("abb");
		System.out.println(s);
	}

}
