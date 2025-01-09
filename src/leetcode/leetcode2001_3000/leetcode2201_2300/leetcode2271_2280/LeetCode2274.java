package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2271_2280;

import java.util.Arrays;

public class LeetCode2274 {


    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int index = 0, start = bottom, max = 0, n = special.length;
        while (index < n) {

            max = Math.max(max, special[index] - start);
            if (n - 1 == index) {
                max = Math.max(max, top - special[index]);
            }
            index++;
            start = special[index] + 1;


        }
        return max;
    }
}
