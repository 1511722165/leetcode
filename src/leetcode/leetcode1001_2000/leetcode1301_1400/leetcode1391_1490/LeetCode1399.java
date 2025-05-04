package leetcode.leetcode1001_2000.leetcode1301_1400.leetcode1391_1490;

import java.util.Arrays;

public class LeetCode1399 {

    public int countLargestGroup(int n) {
        int[] dp=new int[37];
        for (int i=1;i<=n;i++){
            int x=0;
            int m=i;
            while (m>0){
                x+=m%10;
                m/=10;
            }
            ++dp[x];
        }
        Arrays.sort(dp);
        int index=dp[36];
        int count=1;
        int i=35;
        while (dp[i]==index){
            ++count;
            --i;
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode1399 demo=new LeetCode1399();
        demo.countLargestGroup(13);
    }
}
