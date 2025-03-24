package leetcode.leetcode2001_3000.leetcode2601_2700.leetcode2641_2650;

public class LeetCode2643 {

    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] dp=new int[2];
        int m=mat.length;
        int n=mat[0].length;
        for (int i=m-1;i>=0;i--){
            int count=0;
            for (int j=0;j<n;j++){
                if(mat[i][j]==1)++count;
            }
            if(dp[1]<=count){
                dp[0]=i;
                dp[1]=count;
            }
        }
        return dp;
    }
}
