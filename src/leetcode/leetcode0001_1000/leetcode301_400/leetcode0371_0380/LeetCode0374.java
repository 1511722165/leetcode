package leetcode.leetcode0001_1000.leetcode301_400.leetcode0371_0380;

public class LeetCode0374 {

	public int guess(int i) {
		if (i == 1702766719) {
			return 0;
		} else if (i > 1702766719) {
			return -1;
		}
		return 1;
	}

	public int guessNumber(int n) {
		if (n == 1)
			return 1;
		long min = 1, max = n, half = max;
		while (min < n) {
			if (guess((int) half) == 0) {
				break;
			} else if (guess((int) half) == 1) {
				min = half + 1;
			} else {
				max = half - 1;
			}
			half = (min + max) / 2;
		}
		return (int) half;
	}

	// public int guessNumber(int n) {
	// int low = 1, high = n;
	// while(low <= high){
	// int mid = (low + high) / 2;
	// if(guess(mid) == -1){
	// high = mid - 1;
	// }
	// else if(guess(mid) == 1){
	// low = mid + 1;
	// }
	// else return mid;
	// }
	// return 1;
	// }

	public static void main(String[] args) {
		LeetCode0374 demo = new LeetCode0374();
		System.out.println(demo.guessNumber(2126753390));
	}

}
