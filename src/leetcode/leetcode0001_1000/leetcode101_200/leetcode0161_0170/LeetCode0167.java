package leetcode.leetcode0001_1000.leetcode101_200.leetcode0161_0170;

public class LeetCode0167 {
	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			if (target - numbers[i] > numbers[j]) {
				i++;
			} else if (target - numbers[i] == numbers[j]) {
				res[0] = i + 1;
				res[1] = j + 1;
				return res;
			} else {
				j--;
			}

		}
		return res;
	}
}
