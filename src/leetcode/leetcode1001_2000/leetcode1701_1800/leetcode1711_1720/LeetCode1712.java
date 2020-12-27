package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1711_1720;

public class LeetCode1712 {
	
	public int minCount(int[] coins) {
		int result=0;
		for(int i=0;i<coins.length;i++){
			if((coins[i]&1)==1){
				result+=Math.floorDiv(coins[i], 2)+1;
			}else{
				result+=coins[i]/2;
			}
		}

		
		return result;
    }

}
