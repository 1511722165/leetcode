package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2261_2270;

import java.util.Arrays;

public class LeetCode2270 {

    public int waysToSplitArray(int[] nums) {
        long right=0;
        for (int i:nums){
            right+=i;
        }
        int ans = 0;long left = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i];
            if (left >= right) {
                ans++;
            }
        }
        return ans;
    }
}
