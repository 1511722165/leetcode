package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1811_1820;

public class LeetCode1813 {
	public double myPowq(double x, int n) {
		return Math.pow(x, n);
	}
	
	
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1 / x;
        double half = myPow(x, n / 2);
        double mod = myPow(x, n % 2);
        return half * half * mod;
    }
	public static void main(String[] args) {
		LeetCode1813 demo =new LeetCode1813();
		demo.myPow(2.00000,-2147483648);
	}
}
