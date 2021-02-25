package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeetCode0010 {
	public boolean isMatch(String s, String p) {
		Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
	}

	public static void main(String[] args) {
		LeetCode0010 demo = new LeetCode0010();
		demo.isMatch("aa", "a");
	}
}
