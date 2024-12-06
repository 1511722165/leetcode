package leetcode.leetcode0001_1000.leetcode901_1000.leetcode0991_1000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode0997 {

    public int findJudge(int n, int[][] trust) {
        Boolean[] p=new Boolean[n];
        int[] sum=new int[n];
        Arrays.fill(p,true);
        for (int i=0;i<trust.length;i++){
            p[trust[i][0]-1]=false;
            sum[trust[i][1]-1]++;
        }
        for (int i=0;i<n;i++){
            if(p[i]&&sum[i]==n-1){
                return i+1;
            }
        }
        return -1;
    }
}
