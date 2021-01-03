package leetcode.leetcode0001_1000.leetcode301_400.leetcode0381_0390;

public class LeetCode0383 {

	// public boolean canConstruct(String ransomNote, String magazine) {
	// int[] cs = new int[26];
	// char[] sc = ransomNote.toCharArray();
	// char[] mc = magazine.toCharArray();
	//
	// for (int i = 0; i < mc.length; i++) {
	// cs[mc[i] - 97] = cs[mc[i] - 97] + 1;
	// }
	// for (int i = 0; i < sc.length; i++) {
	// if (cs[sc[i] - 97] < 1) {
	// return Boolean.FALSE;
	// }
	// cs[sc[i] - 97] = cs[sc[i] - 97] - 1;
	// }
	// return Boolean.TRUE;
	// }

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] count = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			count[magazine.charAt(i) - 97]++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (count[ransomNote.charAt(i) - 97] > 0) {
				count[ransomNote.charAt(i) - 97]--;
			} else if (count[ransomNote.charAt(i) - 97] == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		LeetCode0383 demo = new LeetCode0383();
		demo.canConstruct("a", "az");
	}
}
