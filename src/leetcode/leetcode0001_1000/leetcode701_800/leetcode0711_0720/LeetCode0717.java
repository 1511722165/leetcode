package leetcode.leetcode0001_1000.leetcode701_800.leetcode0711_0720;

public class LeetCode0717 {

    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        if (bits[len - 1] != 0) return false;

        for (int i = 0; i < len; ) {
            if (i == len - 1) return true;
            if (bits[i] == 1) {
                //1  10 11
                i += 2;
            } else {
                i++;
            }

        }
        return false;
    }
}
