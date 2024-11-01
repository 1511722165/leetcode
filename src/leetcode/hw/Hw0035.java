package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0035 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str= br.readLine())!=null){
            int n =Integer.parseInt(str);
            int [][] dp =new int[n][n];
            int index=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n&&i-j>=0;j++){
                    dp[i-j][j]=index;
                    index++;
                }
            }
            for(int i=0;i<n;i++){
                StringBuilder sb =new StringBuilder();
                for(int j=0;j<n;j++){
                    if(dp[i][j]>0){
                        sb.append(dp[i][j]+" ");
                    }
                }
                System.out.println(sb.toString());
            }
        }}
}
