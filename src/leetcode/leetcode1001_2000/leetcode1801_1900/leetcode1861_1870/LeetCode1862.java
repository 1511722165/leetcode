package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1861_1870;

public class LeetCode1862 {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		int[] res = new int[n - k + 1];
		int max1 = 0;
		int max2=0;
		for (int i = 0; i < k; i++) {
			if(nums[i]>max1){
				max2=max1;
				max1=nums[i];
			}else{}
		}
		res[0] = count;
		for (int i = 1; i + k - 1 < n; i++) {
			count = count + nums[i + k - 1] - nums[i - 1];
			res[i] = count;
		}
		return res;
	}
}
