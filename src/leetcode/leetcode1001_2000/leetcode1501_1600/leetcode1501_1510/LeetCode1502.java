package leetcode.leetcode1001_2000.leetcode1501_1600.leetcode1501_1510;

import java.util.Arrays;

public class LeetCode1502 {
	// public boolean canMakeArithmeticProgression(int[] arr) {
	// Arrays.sort(arr);
	// int cha = arr[1] - arr[0];
	// if (arr[arr.length - 1] - arr[0] != cha * (arr.length - 1)) {
	// return false;
	// } else {
	// for (int i = 1; i < arr.length; i++) {
	// if (arr[i] - arr[i - 1] != cha) {
	// return false;
	// }
	// }
	// }
	// return true;
	// }
	//

	public boolean canMakeArithmeticProgression(int[] arr) {
		Arrays.sort(arr);
		int cha = arr[1] - arr[0];
		if (arr[arr.length - 1] - arr[0] != cha * (arr.length - 1)) {
			return false;
		} else {
			int i = 1;
			while (i < arr.length) {
				if (arr[i] - arr[i - 1] != cha) {
					return false;
				}
				i++;
			}

		}
		return true;
	}
}
