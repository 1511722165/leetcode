package leetcode.leetcode0001_1000.leetcode401_500.leetcode0411_0420;

public class LeetCode0415 {
//	public String addStrings(String num1, String num2) {
//		char[] c1 = num1.toCharArray();
//		char[] c2 = num2.toCharArray();
//		int flag = 0;
//		StringBuilder sb = new StringBuilder();
//		if (c1.length >= c2.length) {
//			for (int i = 0; i < c1.length; i++) {
//				if (c2.length - 1 - i >= 0) {
//					if (c1[c1.length - 1 - i] + c2[c2.length - 1 - i] + flag >= 106) {
//						sb.insert(0, c1[c1.length - 1 - i] + c2[c2.length - 1 - i] + flag - 106);
//						flag = 1;
//					} else {
//						sb.insert(0, c1[c1.length - 1 - i] + c2[c2.length - 1 - i] + flag - 96);
//						flag = 0;
//					}
//				} else {
//					if (c1[c1.length - 1 - i] + flag >= 58) {
//						sb.insert(0, c1[c1.length - 1 - i] + flag - 58);
//						flag = 1;
//					} else {
//						sb.insert(0, c1[c1.length - 1 - i] + flag - 48);
//						flag = 0;
//					}
//				}
//			}
//		} else {
//			for (int i = 0; i < c2.length; i++) {
//				if (c1.length - 1 - i >= 0) {
//					if (c2[c2.length - 1 - i] + c1[c1.length - 1 - i] + flag >= 106) {
//						sb.insert(0, c2[c2.length - 1 - i] + c1[c1.length - 1 - i] + flag - 106);
//						flag = 1;
//					} else {
//						sb.insert(0, c2[c2.length - 1 - i] + c1[c1.length - 1 - i] + flag - 96);
//						flag = 0;
//					}
//				} else {
//					if (c2[c2.length - 1 - i] + flag >= 58) {
//						sb.insert(0, c2[c2.length - 1 - i] + flag - 58);
//						flag = 1;
//					} else {
//						sb.insert(0, c2[c2.length - 1 - i] + flag - 48);
//						flag = 0;
//					}
//				}
//
//			}
//		}
//		if (flag == 1) {
//			sb.insert(0, 1);
//		}
//		return sb.toString();
//	}

	 public String addStrings(String num1, String num2) {
	        StringBuilder sb = new StringBuilder();
	        int carry = 0, i = num1.length()-1, j = num2.length()-1;
	        while(i >= 0 || j >= 0 || carry != 0){
	            if(i>=0) carry += num1.charAt(i--)-'0';
	            if(j>=0) carry += num2.charAt(j--)-'0';
	            sb.append(carry%10);
	            carry /= 10;
	        }
	        return sb.reverse().toString();
	    }
	
	
	
	public static void main(String[] args) {
		LeetCode0415 demo = new LeetCode0415();
		demo.addStrings("9", "99");
	}
}
