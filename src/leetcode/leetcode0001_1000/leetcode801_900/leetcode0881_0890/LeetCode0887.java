package leetcode.leetcode0001_1000.leetcode801_900.leetcode0881_0890;

public class LeetCode0887 {

    public int superEggDrop(int k, int n) {
        if(k==1){
            return n;
        }else if(k==2){
            int res = 0, index = 1;
            while (n > 0) {
                n -= index;
                index++;
                res++;
            }
            return res;
        }else if(k>2){
            int res = 0, index = 1,y=n;
            while (n > 0) {
                n -= index;
                index++;
                //res最多
                res++;
            }

            int x=k-2;
            while (y>0&&y>11){
               y=y/2;
               if(y>=index){

               }
                x--;
            }
            return res;
        }
        return 0;
    }
}
