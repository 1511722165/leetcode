package leetcode.leetcode1001_2000.leetcode1301_1400.leetcode1341_1350;

public class LeetCode1342 {

	public int numberOfSteps(int num) {
		return count(0, num);
	}

	public int count(int count, int num) {
		if (num == 1) {
			return count+1;
		}
		if (num == 0) {
			return count;
		}
		// ÆæÊı
		if ((num & 1) == 1) {
			num -= 1;
			count += 1;
			return count(count, num);
		} else {

			num /= 2;
			count++;
			return count(count, num);
		}

	}

}
