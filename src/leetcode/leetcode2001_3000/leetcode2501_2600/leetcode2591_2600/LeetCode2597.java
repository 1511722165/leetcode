package leetcode.leetcode2001_3000.leetcode2501_2600.leetcode2591_2600;

public class LeetCode2597 {

    private int res = 0; // 用于记录美丽子集的数量

    public int beautifulSubsets(int[] nums, int k) {
        int[] count = new int[1001]; // 用于记录当前子集中是否包含某个数字
        dfs(nums, k, count, 0); // 从索引 0 开始深度优先搜索
        return res - 1; // 减去空集
    }

    private void dfs(int[] nums, int k, int[] count, int ind) {
        if (ind == nums.length) {
            res++; // 找到一个有效的子集
            return;
        }

        // 不选择当前数字 nums[ind]
        dfs(nums, k, count, ind + 1);

        // 选择当前数字 nums[ind]，检查是否满足条件
        if (nums[ind] - k < 0 || count[nums[ind] - k] == 0) {
            if (nums[ind] + k > 1000 || count[nums[ind] + k] == 0) {
                count[nums[ind]]++; // 标记当前数字已被使用
                dfs(nums, k, count, ind + 1); // 递归处理下一个数字
                count[nums[ind]]--; // 回溯，取消标记
            }
        }
    }
}
