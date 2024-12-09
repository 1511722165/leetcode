package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1811_1820;

public class LeetCode1812 {

    public boolean squareIsWhite(String coordinates) {
        if((coordinates.charAt(0)-coordinates.charAt(1))%2==1)return true;
        return false;
    }
}
