package leetcode.leetcode0001_1000.leetcode201_300.leetcode0201_0210;

public class LeetCode0202 {

//	public boolean isHappy(int n) {
//		int flag = (int) Math.sqrt(n);
//		int tep = 0;
//		for (int i = 0; i <= flag; i++) {
//			for (int j = i; j <= flag; j++) {
//				tep = (int) Math.sqrt(n - 2 * i * j);
//				if (n - 2 * i * j == tep * tep) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
	
	public boolean isHappy(int n) {
		boolean flag=false;
		int tmp=n;
		while(tmp>9){
			
			n=tmp%10;
			tmp=tmp/10;
			
			
		}
		
		
		return flag;
	}
}
