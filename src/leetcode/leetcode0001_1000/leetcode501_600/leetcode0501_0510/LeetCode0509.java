package leetcode.leetcode0001_1000.leetcode501_600.leetcode0501_0510;

public class LeetCode0509 {

    public int fib(int n) {
        if(n<2)return n;
        int[] dp=new int[n+1];dp[1]=1;
        int i=2;
        while (i<=n){
            dp[i]=dp[i-1]+dp[i-2];
            ++i;
        }
        return dp[n];
    }
}
