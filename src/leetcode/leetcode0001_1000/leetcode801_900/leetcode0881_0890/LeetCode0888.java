package leetcode.leetcode0001_1000.leetcode801_900.leetcode0881_0890;

import java.util.Arrays;

public class LeetCode0888 {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int m = Arrays.stream(aliceSizes).sum();
        int n = Arrays.stream(bobSizes).sum();
        int i = aliceSizes.length - 1;
            while (i >= 0) {
                for (int j=0;j<bobSizes.length;j++){
                if (m - aliceSizes[i] + bobSizes[j] == n + aliceSizes[i] - bobSizes[j]) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
                }
                i--;
            }

        return null;

    }

    public static void main(String[] args) {
        LeetCode0888 demo=new LeetCode0888();
        demo.fairCandySwap(new int[]{35,17,4,24,10},new int[]{63,21});
    }
}
