package leetcode.leetcode0001_1000.leetcode201_300.leetcode0211_0220;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0217 {
	
	public boolean containsDuplicate(int[] nums) {
		Map<Integer,Integer> map= new HashMap<>();
//		for(int item:nums){
//			if(map.containsKey(item)){
//				return true;
//			}else{
//				map.put(item, item);
//			}
//		}
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				return true;
			}else{
				map.put(nums[i], nums[i]);
			}
		}
			
		return false;
    }
	

}
