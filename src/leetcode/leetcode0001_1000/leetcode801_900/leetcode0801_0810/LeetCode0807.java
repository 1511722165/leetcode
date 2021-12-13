package leetcode.leetcode0001_1000.leetcode801_900.leetcode0801_0810;

public class LeetCode0807 {


    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int res=0;
        int[] x=new int[grid.length];
        int[] y=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if(x[i]<grid[i][j]){
                    x[i]=grid[i][j];
                }
                if(y[j]<grid[i][j]){
                    y[j]=grid[i][j];
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if(grid[i][j]<x[i]&&grid[i][j]<y[j]) {
                    res+=x[i]>y[j]?y[j]-grid[i][j]:x[i]-grid[i][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode0807 test=new LeetCode0807();
        int[][] ssss={{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        test.maxIncreaseKeepingSkyline(ssss);
    }
}
