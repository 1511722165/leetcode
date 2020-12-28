package leetcode.leetcode0001_1000.leetcode101_200.leetcode0131_0140;

public class LeetCode0136 {

	// public int singleNumber(int[] nums) {
	// int length = nums.length;
	// Arrays.sort(nums);
	// for (int i = 0; i < length - 1; i++) {
	// if (nums[i] != nums[i + 1]) {
	// return nums[i];
	// } else if (nums[length - i - 1] != nums[length - i - 2]) {
	// return nums[length - i - 1];
	// }
	// i++;
	// }
	//
	// return nums[length - 1];
	// }

//	public int singleNumber(int[] nums) {
//
//		Set<Integer> set = new HashSet<>();
//		for (int i = 0; i < nums.length; i++) {
//
//			if (set.contains(nums[i])) {
//				set.remove(nums[i]);
//			} else {
//				set.add(nums[i]);
//			}
//		}
//		return set.iterator().next();
//	}
	
	
//	public int singleNumber(int[] nums) {
//		Map<Integer, Integer> map =new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; i++) {
//
//			if (map.containsKey(nums[i])) {
//				map.remove(nums[i]);
//			} else {
//				map.put(nums[i], 1);
//			}
//		}
//		return map.keySet().iterator().next();
//		
//	}
//	
	
	 public int singleNumber(int[] nums) {
	       // 异或 ⊕ 的特性
	       // 0 异或 x  = x
	       // x 异或 b = b
	       // b 异或 b = 0
	       int res = 0;
	       for(int i:nums){
	           res ^= i;
	       }
	       // 最后返回是落单的
	        return res;
	    }
	
	
	public static void main(String[] args) {
		LeetCode0136 demo =new LeetCode0136();
		int[] nums= {4,1,2,1,2};
		System.out.println(demo.singleNumber(nums));
	}
}
