package leetcode.leetcode0001_1000.leetcode001_100.leetcode0021_0030;

public class LeetCode0027 {

	public int removeElement(int[] nums, int val) {
		int res=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val){
				nums[i-res]=nums[i];
			}else{
				res+=1;
				
			}
		}
		return nums.length-res;
	}

}
