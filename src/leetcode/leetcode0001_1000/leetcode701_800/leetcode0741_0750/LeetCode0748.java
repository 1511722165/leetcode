package leetcode.leetcode0001_1000.leetcode701_800.leetcode0741_0750;

public class LeetCode0748 {

	public int minCostClimbingStairs(int[] cost) {
//		if (cost.length <= 1) {
//			return 0;
//		}
//		int result = 0;
//		int i = 0;
//		int k=1;
//		for (; i < cost.length - 3; i++) {
//			if (cost[i] + cost[i + 2] > cost[i + 1]) {
//				result = result + cost[i + 1];
//				i++;
//			} else {
//				result = result + cost[i];
//			}
//		}
//		if (cost.length - i == 2) {
//			int res = cost[i + 1] > cost[i] ? cost[i] : cost[i + 1];
//			result = result + res;
//			return result;
//		} else {
//			int res = cost[i] + cost[i + 2] > cost[i + 1] ? cost[i + 1] : cost[i] + cost[i + 2];
//			result = result + res;
//			return result;
//
//		}
		return 1;

	}

	public static void main(String[] args) {
		LeetCode0748 demo = new LeetCode0748();
		int[] cost = { 0, 0, 0, 0 };
		System.out.println(demo.minCostClimbingStairs(cost));

	}

}
