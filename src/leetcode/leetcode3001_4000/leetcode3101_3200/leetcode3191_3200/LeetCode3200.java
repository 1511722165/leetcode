package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3191_3200;

public class LeetCode3200 {

    public int maxHeightOfTriangle(int red, int blue) {
        int p[] = new int[]{1, 2, 4, 6, 9, 12, 16, 20, 25, 30, 36, 42, 49, 56, 64, 72, 81, 90, 100, 110};
        int max = 0, min = 0;
        for (int i = 0; i < p.length; i++) {
            if (blue >= p[i] && blue < p[i + 1]) {
                max = i + 1;
            }
            if (red >= p[i] && red < p[i + 1]) {
                min = i + 1;
            }
        }
        if (max == min) {
            return max;
        } else if (max > min) {
            return min + 1;
        } else {
            return max + 1;
        }

    }
}
