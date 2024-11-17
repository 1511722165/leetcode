package leetcode.leetcode0001_1000.leetcode501_600.leetcode0531_0540;

public class LeetCode0540 {

    public int singleNonDuplicate(int[] nums) {
        return dps(0, nums.length - 1, nums);

    }

    public int dps(int start, int end, int[] nums) {
        if (start == end) return nums[start];
        int mid = (start + end) / 2;
        if (nums[mid] == nums[mid - 1] && (mid - start) % 2 == 0) {
            return dps(start, mid - 2, nums);
        } else if (nums[mid] == nums[mid + 1] && (mid - start) % 2 == 1) {
            return dps(start, mid - 1, nums);
        } else if (nums[mid] == nums[mid + 1] && (mid - start) % 2 == 0) {
            return dps(mid + 2, end, nums);
        } else if (nums[mid] == nums[mid - 1] && (mid - start) % 2 == 1) {
            return dps(mid + 1, end, nums);
        } else {
            return nums[mid];
        }
    }
}
