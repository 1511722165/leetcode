package leetcode.leetcode2001_3000.leetcode2701_2800.leetcode2711_2720;

public class LeetCode2717 {

    public int semiOrderedPermutation(int[] nums) {
        int start = -1, end = -1, i = 0;
        while (start == -1 || end == -1) {
            if (nums[i] == 1) {
                start = i;
            }
            if (nums[i] == nums.length) {
                end = i;
            }
            i++;
        }
        if (start > end)
            return start + nums.length - end - 2;
        return start + nums.length - end-1;

    }
}
