package leetcode.leetcode0001_1000.leetcode701_800.leetcode0721_0730;

import java.util.Arrays;

public class LeetCode0724 {

	public int pivotIndex(int[] nums) {
		if(nums.length<3){
			return -1;
		}
//		int sums = Arrays.stream(nums, 0, nums.length).sum();
		  int sums = 0;
	        for(int num : nums){
	            sums += num;
	        };
		if(sums==nums[0]){
			return 0;
		}
		int i = 1;
		int left = nums[0];
		while (i < nums.length) {
			if (2 * left + nums[i] == sums) {
				return i;
			} else {
				left += nums[i];
				i++;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		LeetCode0724 demo =new LeetCode0724();
		int [] nums={1,7,3,6,5,6};
		demo.pivotIndex(nums);
	}
}
