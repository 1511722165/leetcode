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
            if(x-1<0){
                z=1;
            }
            x=Math.min(x-1,m-1);
            x=Math.max(0,x);
            y=Math.min(y+1,n-1);
        }else if(z==1){
            if(y-1<0){
                z=0;
            }
            if(x-1<=-1){
              x=n-y+1;
                x = Math.min(x, m - 1);
            }else {
                x = Math.min(x + 1, m - 1);
                y = Math.min(y - 1, n - 1);
                y = Math.max(y, 0);
            }
        }
        System.out.println(x+" "+y+" "+mat[x][y]);
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
