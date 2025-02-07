package leetcode.lcr;

public class LCR127 {

    public static long MOD=1_000_000_007;

    public int trainWays(int num) {
        if (num==0)return 1;
        long[] dp=new long[num+1];
        dp[1]=1;
        dp[0]=1;
        int i=2;
        while (i<=num){
            dp[i]=(dp[i-1]+dp[i-2])%MOD;
            i++;
        }
        int res= (int) (dp[num]%MOD);
        return res;
    }
}
