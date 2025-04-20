package leetcode.leetcode0001_1000.leetcode401_500.leetcode0411_0420;

import java.math.BigInteger;

public class LeetCode0416 {

    public boolean canPartition(int[] nums) {
        int sum=0;
        int dp[]=new int[101];
        for (int i:nums){
            sum+=i;
            ++dp[i];
        }
        int n=nums.length;
        if(n<2||sum%2==1)return false;
        int target = sum >> 1;
        BigInteger f = BigInteger.ONE;
        for (int num : nums) f = f.or(f.shiftLeft(num));
        return f.testBit(target);
    }
}
