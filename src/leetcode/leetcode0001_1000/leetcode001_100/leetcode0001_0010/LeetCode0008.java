package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

public class LeetCode0008 {
	public int myAtoi1(String s) {
	    s=s.trim();
			if (s == null || s.length() == 0) {
				return 0;
			}
			StringBuilder sb = new StringBuilder();
			int res;
			if (s.charAt(0) == '+') {
				int i = 1;
				while (i < s.length()) {
					if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
						sb.append(s.charAt(i));
						i++;
					} else {
						i = s.length();
					}
				}
				if (sb.length() == 0) {
					return 0;
				}
				try {
					res = Integer.parseInt(sb.toString());
					return res;
				} catch (NumberFormatException e) {
					return Integer.MAX_VALUE;
				}
			} else if (s.charAt(0) == '-') {
				int i = 1;
				while (i < s.length()) {
					if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
						sb.append(s.charAt(i));
						i++;
					} else {
						i = s.length();
					}
				}
				if (sb.length() == 0) {
					return 0;
				}
				try {
					sb.insert(0, '-');
					res = Integer.parseInt(sb.toString());
					return res;
				} catch (NumberFormatException e) {
					return Integer.MIN_VALUE;
				}
			} else if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
				int i = 0;
				while (i < s.length()) {
					if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
						sb.append(s.charAt(i));
						i++;
					} else {
						i = s.length();
					}
				}
				if (sb.length() == 0) {
					return 0;
				}
				try {
					res = Integer.parseInt(sb.toString());
					return res;
				} catch (NumberFormatException e) {
					return Integer.MAX_VALUE;
				}
			} else {
				return 0;
			}
		}
	
	
	
	
	
	
	
	
	public int myAtoi(String s) {
        if (s == null || s.length() == 0)   return 0;

        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        int res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int d = s.charAt(i++) - '0';
            if (sign == 1) {
                if (res > Integer.MAX_VALUE / 10) return Integer.MAX_VALUE;
                if (res == Integer.MAX_VALUE / 10 && d > Integer.MAX_VALUE % 10) {
                    return Integer.MAX_VALUE;
                }
            } else {
                if (res > Integer.MAX_VALUE / 10)   return Integer.MIN_VALUE;
                if (res == Integer.MAX_VALUE / 10 && d > Math.abs(Integer.MIN_VALUE % 10))  return Integer.MIN_VALUE;
            }
            
            res = res * 10 + d;
        }
        return res * sign;
    }

	public static void main(String[] args) {
		LeetCode0008 demo = new LeetCode0008();
		demo.myAtoi(" ");
	}
}
