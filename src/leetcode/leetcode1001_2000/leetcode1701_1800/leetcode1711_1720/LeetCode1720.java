package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1711_1720;

public class LeetCode1720 {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        int n = 1;
        while (n < arr.length) {
            arr[n] = encoded[n - 1] ^ arr[n - 1];
            n++;
        }
        return arr;
    }
}
