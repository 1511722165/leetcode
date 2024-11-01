package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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


//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		// 注意 hasNext 和 hasNextLine 的区别
//		while (in.hasNext()) { // 注意 while 处理多个 case
//			String a = in.nextLine();
//			if(a.lastIndexntOf(' ')<0)System.out.println(a.length());
//			System.out.println(a.length() - a.lastIndexOf(' '));
//		}
//	}



}
