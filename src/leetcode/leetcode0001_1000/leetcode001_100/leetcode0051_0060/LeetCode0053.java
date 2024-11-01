package leetcode.leetcode0001_1000.leetcode001_100.leetcode0051_0060;

public class LeetCode0053 {
    public int maxSubArray(int[] nums) {
        int res = 0;
        int max = nums[0];
        for (int num : nums) {
            res += num;
            max = Math.max(res, max);
            if (res < 0) res = 0;
        }
        return max;
    }
}
