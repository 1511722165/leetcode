package leetcode.leetcode0001_1000.leetcode001_100.leetcode0081_0090;

import java.util.Arrays;

public class LeetCode0081 {

    public boolean search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while (i<=  j) {
            if (nums[i] == target || nums[j] == target) {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
