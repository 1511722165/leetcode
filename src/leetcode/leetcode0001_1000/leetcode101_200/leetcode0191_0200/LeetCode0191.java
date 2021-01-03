package leetcode.leetcode0001_1000.leetcode101_200.leetcode0191_0200;

public class LeetCode0191 {

	// public int hammingWeight(int n) {
	// String sb = "0" + Integer.toBinaryString(n) + "0";
	// String[] cs = sb.split("1");
	// return cs.length - 1;
	// }

	// public int hammingWeight(int n) {
	// int res = 0;
	// String sb =Integer.toBinaryString(n);
	// for(int i=0;i<sb.length();i++){
	// if(sb.charAt(i)=='1'){
	// res++;
	// }
	//
	// }
	// return res;
	// }

	// public int hammingWeight(int n) {
	// int res = 0;
	// while (n > 0) {
	// if (n % 4 == 3) {
	// res = res + 2;
	// } else if (n % 4 == 1 || n % 4 == 2) {
	// res = res + 1;
	// }
	// n = n / 4;
	// }
	// return res;
	// }
	//
	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			n &= (n - 1);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		LeetCode0191 demo = new LeetCode0191();
		System.out.println(demo.hammingWeight(11));
	}

}
