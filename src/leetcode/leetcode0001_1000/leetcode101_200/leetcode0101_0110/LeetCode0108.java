package leetcode.leetcode0001_1000.leetcode101_200.leetcode0101_0110;

import java.util.Arrays;

public class LeetCode0108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if (len == 0) return null;

        TreeNode root = new TreeNode(nums[len / 2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, len / 2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, len / 2 + 1, len));

        return root;
    }
}
