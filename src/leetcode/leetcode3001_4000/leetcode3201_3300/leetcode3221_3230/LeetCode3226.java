package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3221_3230;

public class LeetCode3226 {

    public int minChanges(int n, int k) {
        int p = n ^ k;
        int q = p & n;
        if (p == q)
            return Integer.bitCount(p);
        return -1;
    }

    public static void main(String[] args) {
        LeetCode3226 demo = new LeetCode3226();
        demo.minChanges(13, 4);
    }
}
