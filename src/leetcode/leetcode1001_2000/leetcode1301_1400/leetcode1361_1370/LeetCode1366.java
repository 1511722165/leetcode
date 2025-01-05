package leetcode.leetcode1001_2000.leetcode1301_1400.leetcode1361_1370;

import java.util.Arrays;

public class LeetCode1366 {

    public String rankTeams1(String[] votes) {
        int m=votes.length;
        int n=votes[0].length();
        int[][] rank=new int[n+1][26];
        for (int i=0;i<votes.length;i++){
            char[] cs=votes[i].toCharArray();
            for (int j=0;j<n;j++){
                rank[j][cs[j]-'A']++;
                rank[n][cs[j]-'A']++;
            }
        }
        StringBuilder sb=new StringBuilder();


        return "";
    }

    public static void main(String[] args) {
        LeetCode1366 demo=new LeetCode1366();
        demo.rankTeams(new String[]{"ABC","ACB","ABC","ACB","ACB"});
    }


    public String rankTeams(String[] votes) {
        int n = votes[0].length();
        int[][] count = new int[26][n + 1];
        for (int i = 0; i < 26; i++) {
            count[i][n] = -(i+'A');
        }
        for (String vote : votes) {
            char[] voteArray = vote.toCharArray();
            for (int i = 0; i < n; i++) {
                count[voteArray[i] - 'A'][i]++;
            }
        }
        Arrays.sort(count, (o1, o2) -> {
            for (int i = 0; i <= n; i++) {
                if (o1[i] > o2[i]) {
                    return -1;
                }
                if (o1[i] < o2[i]) {
                    return 1;
                }
            }
            return 1;
        });
        StringBuilder sbu = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbu.append((char) (-count[i][n]));
        }
        return sbu.toString();
    }
}
