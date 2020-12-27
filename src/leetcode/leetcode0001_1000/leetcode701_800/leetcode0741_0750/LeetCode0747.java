package leetcode.leetcode0001_1000.leetcode701_800.leetcode0741_0750;

public class LeetCode0747 {

	// public int dominantIndex(int[] nums) {
	// int length = nums.length;
	// if (length == 1) {
	// return 0;
	// }
	// int max = 0;
	// int sec = 0;
	// int index = 0;
	// for (int i = 0; i < length / 2; i++) {
	// if (nums[i] > nums[length - 1 - i]) {
	// sec = sec > nums[length - 1 - i] ? sec : nums[length - 1 - i];
	// if (max < nums[i]) {
	// sec = max > sec ? max : sec;
	// max = nums[i];
	// index = i;
	// } else {
	// sec = sec > nums[i] ? sec : nums[i];
	// }
	// } else {
	// sec = sec > nums[i] ? sec : nums[i];
	// if (max < nums[length - 1 - i]) {
	// sec = max > sec ? max : sec;
	// max = nums[length - 1 - i];
	// index = length - 1 - i;
	// } else {
	// sec = sec > nums[length - 1 - i] ? sec : nums[length - 1 - i];
	// }
	// }
	// }
	// if (max >= 2 * sec)
	// return index;
	//
	// return -1;
	// }

	// public int dominantIndex(int[] nums) {
	// if (nums.length == 1) {
	// return 0;
	// }
	// int[] arrayCopy = Arrays.copyOf(nums, nums.length);
	// Arrays.sort(arrayCopy);
	// if (arrayCopy[nums.length - 1] >= arrayCopy[nums.length - 2] * 2) {
	// for (int i = 0; i < nums.length; i++) {
	// if (nums[i] == arrayCopy[nums.length - 1]) {
	// return i;
	// }
	//
	// }
	// }
	// return -1;
	// int[] result=new int[2];
	// for(int i=0;i<nums.length;i++){
	// if(nums[i]>result[0]){
	// result[0]=nums[i];
	// result[1]=i;
	// }
	// }
	// Arrays.sort(nums);
	// if(result[0]>=nums[nums.length-2]*2){
	// return result[1];
	// }
	// return -1;

	// }

	public int dominantIndex(int[] nums) {

		int fir = nums[0];
		int sec = Integer.MIN_VALUE;
		int index = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > fir) {
				sec = fir;
				fir = nums[i];
				index = i;
			} else if (nums[i] > sec) {
				sec = nums[i];
			} else
				continue;

		}
		if (sec * 2 <= fir)
			return index;
		return -1;

	}

	public static void main(String[] args) {
		LeetCode0747 demo = new LeetCode0747();
		int[] nums = { 1, 0, 0, 0 };
		System.out.println(demo.dominantIndex(nums));
	}
}
