package leetcode.leetcode0001_1000.leetcode101_200.leetcode0171_0180;

public class LeetCode0171 {
//	public int titleToNumber(String s) {
//		char[] cs=s.toCharArray();
//		int result=0;
//		int t=1;
//		for(int i=cs.length-1;i>=0;i--){
//			result+=t*(cs[i]-64);
//			t*=26;
//		}
//		return result;
//    }
	
	
	
	
	public int titleToNumber(String s) {
		int result=0;
		int t=1;
		for(int i=s.length()-1;i>=0;i--){
			result+=t*(s.charAt(i)-64);
			t*=26;
		}
		return result;
    }
}
