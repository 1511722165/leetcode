package leetcode.leetcode0001_1000.leetcode301_400.leetcode0381_0390;

public class LeetCode0389 {

	public char findTheDifference(String s, String t) {
		int[] index = new int[26];
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		for (int i = 0; i < a.length; i++) {
			index[a[i] - 'a'] -= 1;
			index[b[i] - 'a'] += 1;
		}
		index[b[b.length - 1] - 'a'] += 1;
		for (int i = 0; i < 26; i++) {
			if (index[i] == 1) {
				return (char) (i + 'a');
			}
		}
		return (char) 0;
	}

	// public char findTheDifference(String s, String t) {
	// int sum = 0;
	// for (int i = 0; i < s.length(); i++) {
	// sum += t.charAt(i);
	// sum -= s.charAt(i);
	// }
	// sum += t.charAt(t.length() - 1);
	// return (char) sum;
	// }
}
