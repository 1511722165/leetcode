package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1731_1740;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1732 {

	//
	// public int breakfastNumber(int[] staple, int[] drinks, int x) {
	//
	// long res = 0;
	//
	// Arrays.sort(staple);
	// Arrays.sort(drinks);
	// Map<Integer,Integer> map= new HashMap<>();
	//
	// Arrays.sort(drinks);
	//
	// int[] mark = new int[2];
	//
	// for (int i = 0; i < staple.length; i++) {
	//
	// if (mark[0] == staple[i]) {
	//
	// res += mark[1];
	//
	// } else if (staple[i] < x) {
	//
	// if (drinks[drinks.length - 1] <= x - staple[i]) {
	//
	// res += drinks.length;
	//
	// mark[0] = staple[i];
	//
	// mark[1] = drinks.length;
	//
	// } else if (drinks[0] > x - staple[i]) {
	//
	// } else {
	//
	// mark[1] = getIndex(0, drinks.length - 1, drinks, x - staple[i]);
	//
	// res += mark[1];
	//
	// mark[0] = staple[i];
	//
	// }
	//
	// } else {
	//
	// break;
	//
	// }
	//
	// }
	//
	// return (int) (res % 1000000007);
	//
	// }
	//
	// public int getIndex(int start, int last, int[] nums, int target) {
	//
	// int mid = (start + last) / 2;
	//
	// if (nums[mid] <= target && nums[mid + 1] > target) {
	//
	// return mid + 1;
	//
	// } else if (nums[mid] > target) {
	//
	// return getIndex(0, mid, nums, target);
	//
	// } else {
	//
	// return getIndex(mid, last, nums, target);
	//
	// }
	//
	// }

	public int breakfastNumber(int[] staple, int[] drinks, int x) {
		Arrays.sort(staple);
		Arrays.sort(drinks);
		int mod = 1000000007;
		int res = 0;
		int i = 0, j = drinks.length - 1;
		int mark[] = new int[2];
		while (i < staple.length && j >= 0) {
			if (staple[i] == mark[0]) {
				res = (res + mark[1]) % mod;
				i++;
			} else {
				while (j >= 0 && staple[i] + drinks[j] > x) {
					j--;
				}
				mark[0] = staple[i];
				mark[1] = j + 1;
				res = (res + j + 1) % mod;
				i++;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		// List<String> list = new ArrayList<>();

		// for (int i = 0; i <= 5; i++) {

		// list.add(i + "");

		// }

		//

		// List<String> list2 = new ArrayList<>();

		// for (int i = 0; i <= 5; i++) {

		// list2.add(i + "");

		// }

		//

		// List<String> list3 = new ArrayList<>();

		// for (int i = 0; i <= 5; i++) {

		// list3.add(i + "");

		// }

		//

		// long d1 = System.currentTimeMillis();

		// list2.addAll(list);

		// long d2 = System.currentTimeMillis();

		// System.out.println(d2 - d1);

		// long d3 = System.currentTimeMillis();

		// Stream.of(list3, list);

		// long d4 = System.currentTimeMillis();

		// System.out.println(d4 - d3);

		// System.out.println(Stream.of(list3, list));

		LeetCode1732 demo = new LeetCode1732();

		int[] staple = { 2,1,1};

		int drinks[] = {8,9,5,1};

		int x = 9;

		demo.breakfastNumber(staple, drinks, x);

	}

}
