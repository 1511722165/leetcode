package leetcode.leetcode2001_3000.leetcode2001_2100.leetcode2011_2020;

public class LeetCode2012 {

    public int sumOfBeauties(int[] nums) {
        int res = 0;
        int len = nums.length;
        int dp[] = new int[len];
        dp[len - 1] = nums[len - 1];
        //处理最大值
        for (int i = len - 2; i >= 1; i--) {
            if (dp[i + 1] >= nums[i]) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        int index = 0;
        for (int i = 1; i <= len - 2; i++) {
            if (nums[i] > nums[index] && nums[i] < dp[i + 1]) {
                res += 2;
            } else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                ++res;
            }
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        return res;
    }
}
