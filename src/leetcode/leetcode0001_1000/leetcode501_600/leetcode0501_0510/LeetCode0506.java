package leetcode.leetcode0001_1000.leetcode501_600.leetcode0501_0510;

import java.util.PriorityQueue;

public class LeetCode0506 {

    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int maxScore=score[0];
        String[] ranks=new String[n];
        for(int i:score) maxScore=Math.max(maxScore,i);
        int[] score2=new int[maxScore+1];
        for(int i=0;i<n;i++) score2[score[i]]=i+1;
        maxScore=0;
        for(int i=score2.length-1;i>=0;i--){
            if(score2[i]>0) {
                maxScore++;
                if (maxScore == 1) ranks[score2[i]]="Gold Medal";
                else if (maxScore == 2) ranks[score2[i]]="Silver Medal";
                else if (maxScore == 3) ranks[score2[i]]="Bronze Medal";
                else  ranks[score2[i]]=String.valueOf(maxScore);
            }
        }
        return ranks;
    }

    public static void main(String[] args) {
        LeetCode0506 demo=new LeetCode0506();
        demo.findRelativeRanks(new int[]{10,3,8,9,4});
    }
}
