package leetcode.leetcode0050_0060;

public class LeetCode0058 {
	//���һ�����ʵĳ���
	public int lengthOfLastWord(String s) {
		return s.trim().length() - s.trim().lastIndexOf(32) - 1;
	}
}
