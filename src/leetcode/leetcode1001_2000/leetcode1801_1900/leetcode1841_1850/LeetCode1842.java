package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1841_1850;

public class LeetCode1842 {

	public int sumNums(int n) {
//		int sum = 0, index = 1;
//		while (index <= n) {
//			sum += index;
//			index++;
//		}
//		return sum;
		return (int) (Math.pow(n, 2)+ n) >>1;
	}
}
