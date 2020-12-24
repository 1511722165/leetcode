package leetcode.leetcode0001_1000.leetcode001_100.leetcode0051_0060;

public class LeetCode0058 {
	//最后一个单词的长度
	public int lengthOfLastWord(String s) {
		return s.trim().length() - s.trim().lastIndexOf(32) - 1;
	}
}
