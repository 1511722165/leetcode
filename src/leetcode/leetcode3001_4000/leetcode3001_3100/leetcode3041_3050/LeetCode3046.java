package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3041_3050;

import java.util.Arrays;

public class LeetCode3046 {


    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 2]) return false;
            if (nums[i] == nums[i + 1]) i++;
        }
        return true;
    }
}
