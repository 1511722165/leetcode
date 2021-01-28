package leetcode.leetcode1001_2000.leetcode1601_1700.leetcode1681_1690;

public class LeetCode1683 {
	public int[] printNumbers(int n) {
		int num=0;
		for(int i=0;i<n;i++){
			num=num*10+9;
		}
		int[] res = new int[num];
		for (int i = 1; i <= num; i++) {
			res[i - 1] = i;
		}
		return res;
	}
	public static void main(String[] args) {
		LeetCode1683 demo =new LeetCode1683();
		demo.printNumbers(1);
	}
}
