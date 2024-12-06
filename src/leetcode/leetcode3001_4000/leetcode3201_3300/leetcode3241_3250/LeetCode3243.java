package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3241_3250;

import leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3251_3260.LeetCode3254;

import java.util.ArrayList;
import java.util.List;

public class LeetCode3243 {

    public int[] shortestDistanceAfterQueries1(int n, int[][] queries) {
        int[][] dp = new int[n][n];
        int[] ans = new int[queries.length];
        //初始化
        int max=n;
        for (int i = 0; i < n - 1; i++) {
            dp[i][i + 1] = 1;
        }
        for (int i = 0; i < queries.length; i++) {
            dp[queries[i][0]][queries[i][1]] = 1;
            if(max==1){
                ans[i] =max;
            }else {
                int res=this.dfs(dp, n - 1);
                max=Math.min(max,res);
                ans[i] = max;
            }

        }
        return ans;
    }

    private int dfs(int[][] dp, int n) {
        int max = n;
        for (int i = 0; i <=n - 1; i++) {
            if (dp[i][n] == 1) {
                if(i==0){
                    max=1;
                    break;
                }else if (i==1) {
                    max=2;
                    break;
                }
                else {
                int res = dfs(dp, i) + 1;
                max = Math.min(max, res);}
            }
        }
        return max;
    }


    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] steps = new int[n];
        List<Integer>[] pres = new List[n];
        for(int i=1;i<n;i++){
            pres[i] = new ArrayList<>();
            pres[i].add(i-1);
            steps[i] = n-i-1;
        }
        steps[0] = n-1;
        pres[0] = new ArrayList<>();
        int nq = queries.length;
        int[] res = new int[nq];
        for(int i=0;i<nq;i++){
            int[] q = queries[i];
            pres[q[1]].add(q[0]);
            updateDist(steps,pres,  q[0], steps[q[1]]+1);
            res[i] = steps[0];
        }
        return res;
    }
    public void updateDist(int[] steps, List<Integer>[] pres, int ind, int candidate){
        if(candidate>=steps[ind]) return;
        steps[ind] = candidate;
        for(int preInd: pres[ind]){
            updateDist(steps, pres, preInd, candidate+1);
        }
    }


    public static void main(String[] args) {
        LeetCode3243 demo = new LeetCode3243();
        demo.shortestDistanceAfterQueries(5, new int[][]{{2, 4}, {0, 2}, {0, 4}});
    }
}
