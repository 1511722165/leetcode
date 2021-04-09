package leetcode.leetcode0001_1000.leetcode101_200.leetcode0151_0160;

import java.util.Arrays;

public class LeetCode0154 {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
