package leetcode.leetcode0001_1000.leetcode001_100.leetcode0061_0070;

class LeetCode0066 {
	public int[] plusOne(int[] digits) {
		int length = digits.length;
		if (digits[length - 1] != 9) {
			digits[length - 1] = digits[length - 1] + 1;
			return digits;
		} else {
			for (int i = length - 1; i >= 0; i--) {
				if (digits[i] != 9) {
					digits[i] = digits[i] + 1;
					return digits;

				} else {
					digits[i] = 0;

				}

			}
			int[] res = new int[length + 1];
			res[0] = 1;
			return res;
		}
	}
}