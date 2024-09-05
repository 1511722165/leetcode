package leetcode.leetcode2001_3000.leetcode2701_2800.leetcode2701_2710;

import java.util.Arrays;

public class LeetCode2708 {

    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        long res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (res <= 0) {
                    res = nums[i];
                } else {
                    if (i != 0) {
                        res *= nums[i];
                    }
                }
            } else if (nums[i] < 0) {
                if (i + 1 <= nums.length - 1 && nums[i + 1] < 0) {
                    if (res <= 0) {
                        res = nums[i] * nums[i + 1];
                    } else {
                        if (i == 0) {
                            res *= nums[i + 1];
                        } else {
                            res *= nums[i] * nums[i + 1];
                        }
                    }
                    i++;
                }
            } else {
                if (res < 0) {
                    res = nums[i];
                }
            }
        }
        return res;
    }
}
