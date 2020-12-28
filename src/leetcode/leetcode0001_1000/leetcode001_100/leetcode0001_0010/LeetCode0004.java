package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

public class LeetCode0004 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		double res = 0;
		int[] flag = { 0, 0 };
		if (n == 0) {
			// 奇数
			if ((m & 1) == 1) {
				res = nums2[(m - 1) / 2];
				return res;
			}
			// 偶数
			else {
				res = (nums2[(m / 2)] + nums2[(m / 2) - 1]);
				return res / 2;
			}
		}
		if (m == 0) {
			// 奇数
			if ((n & 1) == 1) {
				res = nums1[(n - 1) / 2];
				return res;
			}
			// 偶数
			else {
				res = (nums1[(n / 2)] + nums1[(n / 2) - 1]);
				return res / 2;
			}
		}

		if (((m + n) & 1) == 1) {
			// 奇数取中间一个
			for (int i = 0; i <=(m + n - 1) / 2; i++) {
				if (i < (m + n - 1) / 2) {
					if (nums1[flag[0]] < nums2[flag[1]]) {
						if (flag[0] + 1 < n) {
							flag[0] = flag[0] + 1;
						} else {
							nums1[flag[0]] = nums2[flag[1]];
							flag[1] = flag[1] + 1;
						}

					} else {
						if (flag[1] + 1 < m) {
							flag[1] = flag[1] + 1;
						} else {
							nums2[flag[1]] = nums1[flag[0]];
							flag[0] = flag[0] + 1;
						}
					}
				} else if (i == (m + n - 1) / 2) {
					res = nums1[flag[0]] < nums2[flag[1]] ? nums1[flag[0]] : nums2[flag[1]];
					return res;
				}
			}
		}
		// 偶
		else if (((m + n) & 1) == 0) {
			// 偶数取中间两个
			for (int i = 0; i <= (m + n) / 2 - 1; i++) {

				if (i < (m + n) / 2 - 1) {
					if (nums1[flag[0]] < nums2[flag[1]]) {
						if (flag[0] + 1 < n) {
							flag[0] = flag[0] + 1;
						} else {
							nums1[flag[0]] = nums2[flag[1]];
							flag[1] = flag[1] + 1;
						}
					} else {
						if (flag[1] + 1 < m) {
							flag[1] = flag[1] + 1;
						} else {
							nums2[flag[1]] = nums1[flag[0]];
							flag[0] = flag[0] + 1;
						}
					}
				} else if (i == (m + n) / 2 - 1) {
					if (nums1[flag[0]] > nums2[flag[1]]) {
						res = nums2[flag[1]];
						if (flag[1] + 1 >= m) {
							res = res + nums1[flag[0]];
							return res / 2;
						} else {
							res = res + (nums1[flag[0]] > nums2[flag[1] + 1] ? nums2[flag[1] + 1] : nums1[flag[0]]);
							return res / 2;
						}
					} else {
						res = nums1[flag[0]];
						if (flag[0] + 1 >= n) {
							res = res + nums2[flag[1]];
							return res / 2;
						} else {
							res = res + (nums1[flag[0] + 1] > nums2[flag[1]] ? nums2[flag[1]] : nums1[flag[0] + 1]);
							return res / 2;
						}
					}

				}
			}
		}

		return res;
	}

}
