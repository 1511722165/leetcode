package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1211_1220;

public class LeetCode1217 {

    public int minCostToMoveChips(int[] position) {
        int ji=0;
        int ou=0;
        for(int i:position){
            if(i%2==1){
                ji++;
            }else{
                ou++;
            }
        }
        return Math.min(ji,ou);
    }
}
