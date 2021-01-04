package leetcode.leetcode0001_1000.leetcode201_300.leetcode0261_0270;

public class LeetCode0263 {
	public boolean isUgly(int num) {
		if(num<1){
			return false;
		}
		if (num == 1 || num == 2 || num == 3 || num == 5) {
			return true;
		} else {
			while (num > 1) {
				if (num % 2 == 0) {
					num = num / 2;
				} else if (num % 3 == 0) {
					num = num / 3;
				} else if (num % 5 == 0) {
					num = num / 5;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
