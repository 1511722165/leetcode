package leetcode.leetcode0001_1000.leetcode801_900.leetcode0861_0870;

public class LeetCode0860 {
    public boolean lemonadeChange(int[] bills) {
        // 0 5 1 10 2 20
        int[] ans = new int[2];
        for (int i : bills) {
            if (i == 5) {
                ++ans[0];
            } else if (i == 10) {
                //没零钱
                if (ans[0] <= 0)
                    return false;
                ++ans[1];
                --ans[0];
            } else if (i == 20) {
                if (ans[1] >= 1 && ans[0] >= 1) {
                    --ans[1];
                    --ans[0];
                } else if (ans[0] >= 3) {
                    ans[0] -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
