package leetcode.leetcode1001_2000.leetcode1601_1700.leetcode1611_1620;

import java.util.Arrays;

public class LeetCode1615 {

    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] res = new int[n][2];
        for(int i=0; i<n; i++) res[i][0] = i;
        boolean[][] f = new boolean[n][n];
        for(int[] road : roads){
            res[road[0]][1]++;
            res[road[1]][1]++;
            f[road[0]][road[1]] = true;
        }
        Arrays.sort(res,(o1,o2) -> o2[1] - o1[1]);
        for(int i=0; i<n && res[i][1] == res[0][1]; i++){
            for(int j=i+1; j<n && res[j][1] == res[1][1]; j++){
                if(!f[res[i][0]][res[j][0]] && !f[res[j][0]][res[i][0]]) return res[i][1] + res[j][1];
            }
        }
        return res[0][1] + res[1][1] - 1;
    }
}
