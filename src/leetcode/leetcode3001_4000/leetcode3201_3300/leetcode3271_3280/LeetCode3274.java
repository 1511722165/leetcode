package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3271_3280;

public class LeetCode3274 {


    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if ((coordinate1.charAt(0) % 2 ^ coordinate1.charAt(1) % 2)
                == (coordinate2.charAt(0) % 2 ^ coordinate2.charAt(1) % 2)) {
            return true;
        }
        return false;
    }

}
