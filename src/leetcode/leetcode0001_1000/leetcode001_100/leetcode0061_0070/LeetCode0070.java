package leetcode.leetcode0001_1000.leetcode001_100.leetcode0061_0070;

public class LeetCode0070 {

    public int climbStairs(int n) {
        if(n==1)return 1;
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        int i=3;
        while (i<=n){
            dp[i]=dp[i-1]+dp[i-2];
            ++i;
        }
        return dp[n];
    }
}
