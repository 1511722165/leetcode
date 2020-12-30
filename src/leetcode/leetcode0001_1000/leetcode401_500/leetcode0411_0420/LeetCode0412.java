package leetcode.leetcode0001_1000.leetcode401_500.leetcode0411_0420;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0412 {

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		String s1="FizzBuzz";
		String s2="Fizz";
		String s3="Buzz";
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add(s1);
			} else if (i % 3 == 0) {
				list.add(s2);
			} else if (i % 5 == 0) {
				list.add(s3);
			} else {
				list.add(Integer.toString(i));
			}
		}
		return list;
	}
}
