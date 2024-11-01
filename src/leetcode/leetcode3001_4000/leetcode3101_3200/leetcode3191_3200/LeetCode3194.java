package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3191_3200;

import java.util.Arrays;

public class LeetCode3194 {

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double min = nums[n - 1];
        for (int i = 0; i < n / 2; i++) {
            min = Math.min(min, (nums[i] + nums[n - i - 1]) / 2.0);
        }
        return min;
    }
}
