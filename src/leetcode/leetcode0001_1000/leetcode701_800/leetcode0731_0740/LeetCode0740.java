package leetcode.leetcode0001_1000.leetcode701_800.leetcode0731_0740;

public class LeetCode0740 {

    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[] dp=new int[10001];
        int max=0;
        for (int i:nums){
            dp[i]+=i;
            max=Math.max(max,i);
        }

        for (int i=2;i<=max;i++){
            dp[i]=Math.max(dp[i-2]+dp[i],dp[i-1]);
        }
        return dp[max];
    }

    public static void main(String[] args) {
        LeetCode0740 demo=new LeetCode0740();
        demo.deleteAndEarn(new int[]{3,4,2});
    }
}
