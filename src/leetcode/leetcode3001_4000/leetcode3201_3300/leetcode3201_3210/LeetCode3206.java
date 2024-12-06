package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3201_3210;

public class LeetCode3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int res = 0, n = colors.length;
        for (int i=0; i<n; i++) {
            if (colors[(i-1+n)%n] != colors[i] && colors[i] != colors[(i+1)%n])
                res++;
        }
        return res;
    }
}
