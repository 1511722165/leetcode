package leetcode.leetcode0001_1000.leetcode101_200.leetcode0161_0170;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode0169 {

//	public int majorityElement(int[] nums) {
//		Arrays.sort(nums);
//		for (int i = 0; i <= nums.length / 2; i++) {
//			if (nums[i] == nums[i + nums.length / 2]) {
//				return nums[i];
//			}
//		}
//		return 0;
//	}
	
	
//  	public int majorityElement(int[] nums) {
//		Arrays.sort(nums);
//		for (int i = 0; i <= (nums.length-1) / 2; i++) {
//			if (nums[i] == nums[i + (nums.length-1) / 2]) {
//				return nums[i];
//			}
//		}
//		return 0;
//	}
	
	
	public int majorityElement(int[] nums) {
        int ret = nums[0];
        int count = 1;
        for(int num : nums) {
            if(num != ret) {
                count--;
                if(count == 0) {
                    count = 1;
                    ret = num;
                }
            }
            else
                count++;
        }
        return ret;
    }

	public static void main(String[] args) {
		LeetCode0169  demo= new LeetCode0169();
		int[] nums={3,2,3};
		System.out.println(demo.majorityElement(nums));
	}
}
