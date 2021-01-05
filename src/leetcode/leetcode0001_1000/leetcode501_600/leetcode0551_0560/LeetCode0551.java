package leetcode.leetcode0001_1000.leetcode501_600.leetcode0551_0560;

public class LeetCode0551 {

	// public boolean checkRecord(String s) {
	// if (s.indexOf("LLL") == -1 && (s.indexOf('A') == -1 || s.indexOf('A') ==
	// s.lastIndexOf('A'))) {
	// return true;
	// }
	// return false;
	// }

	public boolean checkRecord(String s) {
		return (s.indexOf("LLL") == -1 && (s.indexOf('A') == -1 || s.indexOf('A') == s.lastIndexOf('A')));

	}

	public static void main(String[] args) {
		LeetCode0551 demo = new LeetCode0551();
		demo.checkRecord("PPALLL");
	}
}
