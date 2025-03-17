package leetcode.leetcode0001_1000.leetcode101_200.leetcode0131_0140;

public class LeetCode0134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int left=n-1,right=0,stock=gas[right]-cost[right];
        while (left!=right){
            //存量小于0 需要向后走 知道库存大于0才能向前走
            if(stock<0){
                stock+=(gas[left]-cost[left]);
                --left;
            }else {
                //存量大于等于0 可以向后走
                ++right;
                stock+=(gas[right]-cost[right]);
            }
        }
        if(stock>=0)return left+1==n?0:left+1;
        return -1;
    }

    public static void main(String[] args) {
        LeetCode0134 demo=new LeetCode0134();
        demo.canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2});
    }
}
