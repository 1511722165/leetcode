package leetcode.leetcode2001_3000.leetcode2901_3000.leetcode2951_2960;

import java.util.Arrays;

public class LeetCode2959 {

    public int numberOfSets1(int n, int maxDistance, int[][] roads) {

        if(n==1)return 2;
        int[][] pd=new int[n][n];
        for (int[] arr:roads){
            if(pd[arr[0]][arr[1]]==0){
                pd[arr[0]][arr[1]]=arr[3];
            }else {
             Math.min(pd[arr[0]][arr[1]],arr[3]);
            }
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if (arr[i]==-1)break;;
                arr[i]+=pd[i][j];
                if(arr[i]>maxDistance){
                    arr[i]=-1;
                }
            }


        }



        return 0;
    }


    public int numberOfSets(int n, int maxDistance, int[][] roads) {
        int u = 1 << n, ans = n + 1;
        int[][] f = new int[n][n];
        for(int i = 1; i < u; i++) {
            if(Integer.bitCount(i) == 1) continue;
            for(int j = 0; j < n; j++) {
                Arrays.fill(f[j], Integer.MAX_VALUE / 2);
                f[j][j] = 0;
            }
            for(int[] edge : roads) {
                int x = edge[0], y = edge[1], dis = edge[2];
                if((1 << x & i) != 0 && (1 << y & i) != 0) {
                    f[x][y] = f[y][x] = Math.min(f[x][y], dis);
                }
            }
            for(int k = 0; k < n; k++) {
                for(int j = 0; j < n; j++) {
                    for(int t = 0; t < n; t++)
                        f[j][t] = Math.min(f[j][t], f[j][k] + f[k][t]);
                }
            }
            boolean check = true;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if((1 << j & i) != 0 && (1 << k & i) != 0 && f[j][k] > maxDistance) {
                        check = false;
                    }
                }
                if(!check) break;
            }
            ans += check ? 1 : 0;
        }
        return ans;
    }

    public static void main(String[] args) {
LeetCode2959 demo =new LeetCode2959();
demo.numberOfSets(3,5,new int[][]{{0,1,2},{1,2,10},{0,2,10}});
    }
}
