package leetcode.leetcode1001_2000.leetcode1501_1600.leetcode1551_1560;

import java.util.Arrays;

public class LeetCode1552 {

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 0, right = (position[position.length-1] - position[0])/(m-1) + 1, ans = 0;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (check(position, m, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return ans;
    }

    private boolean check(int[] position, int m, int x) {
        int currentIndex = 1;
        int pre = position[0];
        while (currentIndex < position.length) {
            if (position[currentIndex] >= pre + x) {
                m--;
                if (m <= 1) {
                    return true;
                }
                pre = position[currentIndex];
            }
            currentIndex++;
        }
        return m <= 1;
    }
}
