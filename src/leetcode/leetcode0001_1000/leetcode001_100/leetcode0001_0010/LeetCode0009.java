package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

public class LeetCode0009 {

	// public boolean isPalindrome(int x) {
	//
	// if(x<0){
	// return Boolean.FALSE;
	// }
	// StringBuilder stringBuilder= new StringBuilder(String.valueOf(x));
	// stringBuilder.reverse();
	// if(String.valueOf(x).equals(stringBuilder.toString())){
	// return Boolean.TRUE;
	// }
	//
	// return Boolean.FALSE;
	//
	// }

	public boolean isPalindrome(int x) {

		int num = x;
		if (x < 0) {
			return Boolean.FALSE;
		}

		int c = 0;
		int ra = 0;

		while (x > 0) {
			c = x % 10;

			ra = ra * 10 + c;

			x = x / 10;

		}
		if (ra == num)
			return Boolean.TRUE;
		return Boolean.FALSE;

	}

}
