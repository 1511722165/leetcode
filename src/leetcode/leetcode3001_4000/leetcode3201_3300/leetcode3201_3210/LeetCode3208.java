package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3201_3210;

public class LeetCode3208 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int len=colors.length;
        int[] groups = new int[len];
        int index = 0, size = 1;
        for(int i = 1; i < len; ++i) {
            if (colors[i] != colors[i - 1]) {
                size ++;
            } else {
                groups[index ++] = size;
                size = 1;
            }
        }
        if (index == 0 && colors[0] != colors[len - 1]) {
            return size >= k ? size : 0;
        }
        if (colors[0] != colors[len - 1]) {
            groups[0] += size;
        } else {
            groups[index ++] = size;
        }
        int ans = 0;
        for(int i = 0; i < index; ++i) {
            if (groups[i] >= k) {
                ans += groups[i] - k + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode3208 demo=new LeetCode3208();
        demo.numberOfAlternatingGroups(new int[]{0,1,0,1,0},3);
    }
}
