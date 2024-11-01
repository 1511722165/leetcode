package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//public class Hw0016 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int money = in.nextInt();
//        int num = in.nextInt();
//        int[][] prices = new int[num + 1][3];
//        int[][] weights = new int[num + 1][3];
//        for (int i = 1; i <= num; i++) {
//            int price = in.nextInt();
//            int weight = in.nextInt();
//            int zfj = in.nextInt();
//            weight *= price;
//            if (zfj == 0) {
//                prices[i][0] = price;
//                weights[i][0] = weight;
//            } else if (prices[zfj][1] == 0) {
//                prices[zfj][1] = price;
//                weights[zfj][1] = weight;
//            } else {
//                prices[zfj][2] = price;
//                weights[zfj][2] = weight;
//            }
//        }
//        int[] dp = new int[money + 1];// dp数组
//        for (int i = 1; i <= num; i++) {// 遍历物品
//            for (int j = money; j >= 0; j -= 10) {// 遍历money
//                int a = j - prices[i][0];
//                int b = j - prices[i][0] - prices[i][1];
//                int c = j - prices[i][0] - prices[i][2];
//                int d = j - prices[i][0] - prices[i][1] - prices[i][2];
//                int e = weights[i][0];
//                int f = weights[i][0] + weights[i][1];
//                int g = weights[i][0] + weights[i][2];
//                int h =  weights[i][0] + weights[i][1] + weights[i][2];
//                dp[j] = a >= 0 ? Math.max(dp[j], dp[a] + e) : dp[j];// 是否购买主件
//                dp[j] = b >= 0 ? Math.max(dp[j], dp[b] + f) : dp[j];// 是否购买主件和附件1
//                dp[j] = c >= 0 ? Math.max(dp[j], dp[c] + g) : dp[j];// 是否购买主件和附件2
//                dp[j] = d >= 0 ? Math.max(dp[j], dp[d] + h) : dp[j];// 是否购买主件和附件1和附件2
//            }
//        }
//        System.out.println(dp[money]);// 输出结果
//
//    }
// }


class Good {
    int v;
    int p;
    int q;
    int a1=0;
    int a2=0;
    Good(int v,int p,int q){
        this.v=v;
        this.p=p;
        this.q=q;
    }
    Good(){}
    public void setV(int v){
        this.v=v;
    }
    public void setP(int p){
        this.p=p;
    }
    public void setQ(int q){
        this.q=q;
    }
    public void setA1(int a1){
        this.a1=a1;
    }
    public void setA2(int a2){
        this.a2=a2;
    }
}
public class Hw0016{

    public static int dw=100;//加快运行

    public static void main(String[] args) throws IOException {
        boolean flag=true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        int N = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        Good[] A = new Good[m+1];
        for(int i =1;i<=m;i++){
            strArr = br.readLine().split(" ");
            int v = Integer.parseInt(strArr[0]);
            int p = Integer.parseInt(strArr[1]);
            int q = Integer.parseInt(strArr[2]);
            if(flag){
                if(v%dw!=0){
                    flag=false;
                    dw=10;
                    for(int j=1;j<i;j++)
                        A[j].setV(A[j].v*10);
                }
            }
            v=v/dw;
            if(A[i]!=null){
                A[i].setV(v);
                A[i].setP(p);
                A[i].setQ(q);
            }else{
                A[i]=new Good(v,p,q);
            }
            if(q>0){
                if(A[q]==null){
                    A[q]=new Good();
                }
                if(A[q].a1==0){
                    A[q].setA1(i);
                }else{
                    A[q].setA2(i);
                }
            }
        }
        N=N/dw;
        dp(N,A);
    }

    public static void dp(int N,Good[] A){
        int[][] dp = new int[N+1][A.length];
        for(int i=1;i<A.length;i++){
            int v=-1,v1=-1,v2=-1,v3=-1,tempdp=-1,tempdp1=-1,tempdp2=-1,tempdp3=-1;
            v=A[i].v;
            tempdp=v*A[i].p;
            if(A[i].a1!=0&&A[i].a2!=0){
                v3=v+A[A[i].a1].v+A[A[i].a2].v;
                tempdp3=tempdp+A[A[i].a1].v*A[A[i].a1].p+A[A[i].a2].v*A[A[i].a2].p;
            }
            if(A[i].a1!=0){
                v1 = v + A[A[i].a1].v;
                tempdp1=tempdp+A[A[i].a1].v*A[A[i].a1].p;
            }
            if(A[i].a2!=0){
                v2 = v + A[A[i].a2].v;
                tempdp2=tempdp+A[A[i].a2].v*A[A[i].a2].p;
            }
            for(int j=1;j<N+1;j++){
                if(A[i].q>0){
                    dp[j][i]=dp[j][i-1];
                }else{
                    dp[j][i]=dp[j][i-1];
                    if(j>=v&&v!=-1) dp[j][i] = Math.max(dp[j][i],dp[j-v][i-1]+tempdp);
                    if(j>=v1&&v1!=-1) dp[j][i]=Math.max(dp[j][i],dp[j-v1][i-1]+tempdp1);
                    if(j>=v2&&v2!=-1) dp[j][i]=Math.max(dp[j][i],dp[j-v2][i-1]+tempdp2);
                    if(j>=v3&&v3!=-1) dp[j][i]=Math.max(dp[j][i],dp[j-v3][i-1]+tempdp3);
                }
            }

        }
        System.out.println(dp[N][A.length-1]*dw);
    }
}