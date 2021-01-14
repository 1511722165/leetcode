package leetcode.leetcode0001_1000.leetcode401_500.leetcode0411_0420;

public class LeetCode0414 {
	public int thirdMax(int[] nums) {
		int max = nums[0];
		int maxs = nums[0];
		int maxt = nums[0];
		int i = 1;
		while (i < nums.length) {
			if (nums[i] != max && nums[i] != maxs && nums[i] != maxt) {
				if (nums[i] > max) {
					maxt = maxs;
					maxs = max;
					max = nums[i];
				} else if (nums[i] > maxs && nums[i] < max) {
					maxt = maxs;
					maxs = nums[i];
				} else if (nums[i] > maxt) {
					maxt = nums[i];
				} else {

					if (maxs == maxt && max == maxs) {
						maxs = nums[i];
						maxt = nums[i];
					} else if (maxs == maxt) {
						maxt = nums[i];
					}

				}
			}
			i++;
		}
		if (maxs == maxt) {
			return max;
		}
		return maxt;
	}
}
