package leetcode.leetcode0001_1000.leetcode701_800.leetcode0781_0790;

import java.util.Arrays;

public class LeetCode0781 {


    public int numRabbits(int[] answers) {
        int n=answers.length;
        int[] dp = new int[1001];
        for (int num : answers) {
            ++dp[num];
        }
        int ans = dp[0];
        for (int i=1;i<n;i++){
            if(dp[i]>0){
                int b=dp[i]%(i+1);
                if(b==0){
                    ans+=dp[i];
                }else {
                    ans+=dp[i]+(i+1-b);
                }
            }
        }
        return ans;
    }
}
