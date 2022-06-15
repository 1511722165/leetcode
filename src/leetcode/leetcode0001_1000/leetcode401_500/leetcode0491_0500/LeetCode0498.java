package leetcode.leetcode0001_1000.leetcode401_500.leetcode0491_0500;

public class LeetCode0498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] result=new int[m*n];
        int i=0,x=0,y=0,z=0;
        while(i<m*n){
        result[i]=mat[x][y];
        if(z==0){
            x-=1;
            y+=1;
            if(y>=n){
                x=Math.min(x+2,m);
                y=n-1;
                z=1;
            }else if(x<=-1){
                z=1;
                x=0;
            }
        }else if(z==1){
            x+=1;
            y-=1;
            if(x>=m){
                z=0;
                y=Math.min(y+2,n);
                x=m-1;
            }else
            if(y<=-1){
                z=0;
                y=0;
            }
        }
       // System.out.println(x+" "+y+" "+mat[x][y]);
        i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        LeetCode0498 demo= new LeetCode0498();
        System.out.println(demo.findDiagonalOrder(a));
    }
}
