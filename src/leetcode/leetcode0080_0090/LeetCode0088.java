package leetcode.leetcode0080_0090;

public class LeetCode0088 {

	// public void merge(int[] nums1, int m, int[] nums2, int n) {
	// List<Integer> list = new ArrayList<>();
	// int j = 0;
	// for (int item : nums1) {
	// if (j < m) {
	// list.add(item);
	// }
	// j++;
	// }
	// for (int item : nums2) {
	//
	// list.add(item);
	// }
	// list.sort(null);
	// for (int i = 0; i < list.size(); i++) {
	// nums1[i] = list.get(i);
	// }
	// }

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (n == 0) {

		} else if (m == 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
		} else {

			for (int i = m + n - 1; i >= 0; i--) {
				if (nums1[m - 1] > nums2[n - 1]) {
					nums1[i] = nums1[m - 1];
					m -= 1;
					if (m <= 0) {
						m = 1;
						nums1[0] = nums2[0];
					}
				} else {
					nums1[i] = nums2[n - 1];
					n -= 1;
					if (n <= 0) {
						break;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		LeetCode0088 demo = new LeetCode0088();
		int[] a = { 2, 0 };
		int[] b = { 1 };
		demo.merge(a, 1, b, 1);
	}
}
