package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2271_2280;

public class LeetCode2275 {

    public int largestCombination(int[] candidates) {
        int[] stack = new int[24];
        for (int i : candidates) {
            int index = 0;
            while (i > 0) {
                if ((i & 1) ==1 ) stack[index]++;
                i >>= 1;
                index++;
            }
        }
        int max = 1;
        for (int i = 0; i < 24; i++) {
            max = Math.max(max, stack[i]);
        }
        return max;
    }

}
