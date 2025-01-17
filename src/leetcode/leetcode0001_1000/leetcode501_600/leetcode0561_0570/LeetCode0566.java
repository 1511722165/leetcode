package leetcode.leetcode0001_1000.leetcode501_600.leetcode0561_0570;

public class LeetCode0566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int rm=0,cn=0;
        int[][] res=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
             res[i][j]=mat[rm][cn];
             cn++;
             if(cn==n){
                 cn=0;
                 rm++;
             }
            }
        }
        return res;
    }
}
