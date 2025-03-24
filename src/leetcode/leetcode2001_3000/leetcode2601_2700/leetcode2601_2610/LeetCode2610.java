package leetcode.leetcode2001_3000.leetcode2601_2700.leetcode2601_2610;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i : nums) {
            if (i > max) max = i;
        }
        int[] dp = new int[max + 1];
        for (int i : nums) {
            dp[i]++;
        }

        List<List<Integer>> list = new ArrayList<>();

        while (n > 0) {
            List<Integer> add = new ArrayList<>();
            for (int i = 1; i <= max; i++) {
                if (dp[i] > 0) {
                    add.add(i);
                    --dp[i];
                    --n;
                }
            }
            list.add(add);
        }
        return list;
    }
}
