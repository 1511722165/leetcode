package leetcode.leetcode0001_1000.leetcode401_500.leetcode0441_0450;

public class LeetCode0441 {
//	public int arrangeCoins(int n) {
//		int m = (int) Math.ceil(Math.sqrt(2.0 * n));
//		long temp=(long) (m/2.0 * (m + 1));
//		while (temp > n) {
//			m--;
//			temp=(long) (m/2.0 * (m + 1));
//		}
//		return m;
//	}
	
	
	 public int arrangeCoins(int n) {
	        return (int)(Math.sqrt(1+8*(long)n)-1)/2;
	    }

	public static void main(String[] args) {
		LeetCode0441 demo = new LeetCode0441();
		demo.arrangeCoins(5);
	}
}
