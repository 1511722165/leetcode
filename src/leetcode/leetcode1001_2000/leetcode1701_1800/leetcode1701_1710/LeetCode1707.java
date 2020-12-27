package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1701_1710;

public class LeetCode1707 {

	public int game(int[] guess, int[] answer) {

		int res = 0;
		res = guess[0] == answer[0] ? res + 1 : res;
		res = guess[1] == answer[1] ? res + 1 : res;
		res = guess[2] == answer[2] ? res + 1 : res;
		return res;
	}
}
