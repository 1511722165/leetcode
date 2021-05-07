package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1481_1590;

public class LeetCode1486 {

    public int xorOperation(int n, int start) {
        int i=1;
        int temp=2*i+start;
        int res=start;
        while (i<n) {
            res = res ^ temp;
            i++;
            temp=2*i+start;
        }
        return res;
    }
}
