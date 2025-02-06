package leetcode.leetcode0001_1000.leetcode001_100.leetcode0081_0090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0090 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, 0, nums, ans);
        return ans;
    }

    private static void dfs(int s, int i, int[] nums, List<List<Integer>> ans) {
        if (i == nums.length) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (((s >> j) & 1) == 1) {
                    cur.add(nums[j]);
                }
            }
            ans.add(cur);
            return;
        }
        dfs(s, i + 1, nums, ans);
        if (i > 0 && (s >> (i - 1)) == 0 && nums[i] == nums[i - 1]) {
            return;
        }
        dfs(s ^ (1 << i), i + 1, nums, ans);
    }

    public static void main(String[] args) {
        LeetCode0090 demo =new LeetCode0090();
        demo.subsetsWithDup(new int[]{1,2,2});
    }
}
