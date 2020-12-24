package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0001 {
	
	
	// public int[] twoSum(int[] nums, int target) {
	//
	// List<Integer> list = new ArrayList<>();
	// for(int i=0;i<nums.length;i++){
	// Integer b=nums[i];
	// Integer a=target-b;
	// if(list.contains(b)){
	// int[] result = new int[2];
	// result[0]=list.indexOf(b);
	// result[1]=i;
	// return result;
	// }else{
	// list.add(a);
	// }
	// }
	// return null;
	//
	// }
	//

	// 两数之和
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		Map<Integer, Integer> map = new HashMap<>(length);
		for (int i = 0; i < length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				return new int[] { map.get(diff), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
