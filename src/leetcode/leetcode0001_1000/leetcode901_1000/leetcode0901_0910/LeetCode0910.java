package leetcode.leetcode0001_1000.leetcode901_1000.leetcode0901_0910;

import java.util.Arrays;

public class LeetCode0910 {


    public int smallestRangeII(int[] nums, int k) {
        // 排序 + 贪心枚举
        Arrays.sort(nums);
        // diff初值为nums全+k或全-k的极差，后续枚举分界点i。
        int n = nums.length, diff = nums[n - 1] - nums[0];
        // 枚举分界点，i及左侧均 + k，右侧i + 1开始均-k，
        // 那么max取左半段最大值(nums[i] + k)与右半段最大值(nums[n-1] - k)中较大者，
        // min取左半段最小值(nums[0] + k)与右半段最小值(nums[i+1] - k)中较小者。
        for(int i = 0; i < n - 1; ++i){
            int max = Math.max(nums[i] + k, nums[n - 1] - k);
            int min = Math.min(nums[0] + k, nums[i + 1] - k);
            diff = Math.min(diff, max - min);
        }
        return diff;
    }
}
