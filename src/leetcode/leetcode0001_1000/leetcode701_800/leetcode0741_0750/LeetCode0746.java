package leetcode.leetcode0001_1000.leetcode701_800.leetcode0741_0750;

public class LeetCode0746 {

	public int minCostClimbingStairs(int[] cost) {
		if (cost.length <= 1) {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		LeetCode0746 demo = new LeetCode0746();
		int[] cost = { 0, 1, 2, 2 };
		System.out.println(demo.minCostClimbingStairs(cost));

	}

}
