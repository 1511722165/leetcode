package leetcode.leetcode0001_1000.leetcode101_200.leetcode0161_0170;

public class LeetCode0168 {

	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		char[] c = { 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		while (n >= 1) {

			if(n % 26==0){
				sb.insert(0, (char) (c[0]));
				n = n / 26;
				n--;
			}else{
				sb.insert(0, (char) (c[n % 26]));
				n = n / 26;
			}
		}
		return sb.toString();
	}
}
