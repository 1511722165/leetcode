package leetcode.leetcode0001_1000.leetcode301_400.leetcode0321_0330;

public class LeetCode0326 {

	// public boolean isPowerOfThree(int n) {
	// if (n <= 0) {
	// return Boolean.FALSE;
	// } else if (n == 1 || n == 3) {
	// return Boolean.TRUE;
	// }
	// double temp = n;
	// while (temp > 3) {
	// if (temp == 3 || temp == 9) {
	// return Boolean.TRUE;
	// } else if (temp > 3 && temp < 9) {
	// return Boolean.FALSE;
	// }
	// temp = temp / 3;
	// }
	// return Boolean.FALSE;
	// }
	
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
       return false;
   }
   while (n % 3 == 0) {
       n /= 3;
   }
   return n == 1;
}

	public static void main(String[] args) {
		LeetCode0326 demo = new LeetCode0326();
		demo.isPowerOfThree(81);
	}
}
