package leetcode.leetcode0001_1000.leetcode401_500.leetcode0471_0480;

public class LeetCode0476 {

	public int findComplement(int num) {
		int n = num;
		// xoxoxoox xxxxxxxx
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return n ^ num;
	}

	// public int findComplement(int num) {
	// String s = Integer.toBinaryString(num);
	// s=s.replace('1', 'a');
	// s=s.replace('0', '1');
	// s=s.replace('a', '0');
	// return Integer.parseInt(s, 2);
	// }
	public static void main(String[] args) {
		LeetCode0476 demo = new LeetCode0476();
		demo.findComplement(5);
	}
}
