package leetcode.leetcode0001_1000.leetcode001_100.leetcode0051_0060;

public class LeetCode0058 {
	//���һ�����ʵĳ���
	public int lengthOfLastWord(String s) {
		return s.trim().length() - s.trim().lastIndexOf(32) - 1;
	}
}
