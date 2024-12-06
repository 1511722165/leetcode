package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3001_3010;

public class LeetCode3001 {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if ((a == e && c != e) || (b == f && d != f)
                || (a == e && c == e && (d > b && d > f || d < b && d < f))
                || (b == f && d == f && (c > a && c > e || c < a && c < e))) {
            return 1;
        }
        int ec = Math.abs(e - c);
        int fd = Math.abs(f - d);
        int ea = Math.abs(e - a);
        int fb = Math.abs(f - b);
        if ((ec == fd && ea != fb)
                || (ec == fd && ea == fb && ((a > e && a > c) || (a < e && a < c) || (b > f && b > d) || (b < f && b < d)
        ))) {
            return 1;
        }

        return 2;
    }

    public static void main(String[] args) {
        LeetCode3001 demo=new LeetCode3001();
        System.out.println(demo.minMovesToCaptureTheQueen(4,3,3,4,5,2));

    }
}
