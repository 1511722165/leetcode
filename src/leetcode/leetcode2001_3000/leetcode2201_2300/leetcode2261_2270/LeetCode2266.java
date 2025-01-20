package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2261_2270;

public class LeetCode2266 {

    public static int mod=1000000007;
//TODO
    public int countTexts(String pressedKeys) {
        int len=pressedKeys.length();
        if (len==1)return 1;
        char c=pressedKeys.charAt(0);
        int count=1;
        long sum=0l;
        for (int i=1;i<len;i++){
            if(c==pressedKeys.charAt(i)){
                count++;
            }else {
                sum*=count(c,count);
                c=pressedKeys.charAt(i);
                count=1;
            }
        }
        return (int) (sum%mod);
    }


    private long count(char c,int count){
        switch (c){
            case '2':
                int [][][] dp=new int[3][3][count];

                for (int i=0;i<3;i++){
                    int cx=count;
                    for (int j=0;i<3;j++){



                    }



                }
                break;
            case '3':break;
            case '4':break;
            case '5':break;
            case '6':break;
            case '7':break;
            case '8':break;
            case '9':break;
            default:break;


        }

        return 0l;
    }

    private int calc(int size,int n){
        int[][] dp=new int[size][n];
        while (n>=1){
            dp[0][n - 1] = (dp[0][n-0] + dp[0][n]) % mod;
            dp[1][n - 1] = (dp[8][n] + dp[6][n]) % mod;
            dp[2][n - 1] = (dp[7][n] + dp[9][n]) % mod;


        }


return 0;
    }
}
