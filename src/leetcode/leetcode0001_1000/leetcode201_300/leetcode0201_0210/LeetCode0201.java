package leetcode.leetcode0001_1000.leetcode201_300.leetcode0201_0210;

public class LeetCode0201 {

//	public int rangeBitwiseAnd(int m, int n) {
//		int count = n - m;
//		if (count == 0) {
//			return n;
//		} else {
//			String string = Integer.toBinaryString(n);
//			StringBuilder sb = new StringBuilder();
//			if (string.length() <= count) {
//				return 0;
//			}
//			for (int i = string.length() - 1; i >= string.length()-1 - count; i--) {
//				if (string.charAt(i) == '1') {
//					count--;
//					sb.append(0);
//					if (count == 0) {
//						sb.insert(0, string.substring(0, i));
//						return Integer.parseInt(sb.toString(), 2);
//					}
//
//				} else {
//					sb.append(0);
//				}
//
//			}
//			return Integer.parseInt(sb.toString(), 2);
//
//		}
//	}

	int rangeBitwiseAnd(int m, int n) {
	    int offset = 0;
	    for (; m != n; ++offset) {
	        m >>= 1;
	        n >>= 1;
	    }
	    return n << offset;
	}
	public static void main(String[] args) {
		LeetCode0201 demo = new LeetCode0201();
		demo.rangeBitwiseAnd(4, 6);
	}

}
