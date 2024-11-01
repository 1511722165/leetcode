package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3171_3180;

import java.util.Arrays;

public class LeetCode3175 {

    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length, res = 0, win = 0;
        for (int i = 1; i < n; i++) {
            if (skills[res] > skills[i]) win++;
            else {
                res = i;
                win = 1;
            }
            if (win >= k) return res;
        }
        return res;
    }
}
