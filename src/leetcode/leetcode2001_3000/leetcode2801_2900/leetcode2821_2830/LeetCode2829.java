package leetcode.leetcode2001_3000.leetcode2801_2900.leetcode2821_2830;

public class LeetCode2829 {

    public int minimumSum(int n, int k) {
        int max = (k + k + n - 1) * n / 2;
        //找小的数
        int left = 1;
        int right = k - 1;
        while (left <= right && n > 0) {
            max = max - (k + n - 1) + left;
            ++left;
            --right;
            --n;
        }
        return max;
    }

    public static void main(String[] args) {
        LeetCode2829 demo = new LeetCode2829();
        demo.minimumSum(2, 6);
    }
}
