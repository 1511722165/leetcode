package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3181_3190;

public class LeetCode3185 {

    public long countCompleteDayPairs(int[] hours) {
        long[] arr = new long[24];
        for (int i : hours) {
            arr[i % 24]++;
        }
        long res = 0;
        res += (arr[0] * (arr[0] - 1)) / 2;
        res += (arr[12] * (arr[12] - 1)) / 2;
        for (int i = 1; i <= 11; i++) {
            res += arr[i] * arr[24 - i];
        }
        return res;
    }
}
