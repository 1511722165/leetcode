package leetcode.leetcode0001_1000.leetcode001_100.leetcode0021_0030;

public class LeetCode0028 {

	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		return haystack.indexOf(needle);
	}

}
