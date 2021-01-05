package leetcode.leetcode0001_1000.leetcode401_500.leetcode0491_0500;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0500 {

	public String[] findWords(String[] words) {
		List<String> list = new ArrayList<String>();
		char[] line1 = { 'q', 'Q', 'w', 'W', 'e', 'E', 'r', 'R', 't', 'T', 'y', 'Y', 'u', 'U', 'i', 'I', 'o', 'O', 'p',
				'P' };
		char[] line2 = { 'a', 'A', 's', 'S', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K', 'l', 'L' };
		char[] line3 = { 'z', 'Z', 'x', 'X', 'c', 'C', 'v', 'V', 'b', 'B', 'n', 'N', 'm', 'M' };
		for (int j = 0; j <words.length; j++) {
			int flag = 0;
			for (char c : line3) {
				if (words[j].indexOf(c) >= 0) {
					flag++;
					break;
				}
			}
			for (char c : line2) {
				if (words[j].indexOf(c) >= 0) {
					flag++;
					break;
				}
			}
			if (flag != 2) {
				for (char c : line1) {
					if (words[j].indexOf(c) >= 0) {
						flag++;
						break;
					}
				}
				if (flag != 2) {
					list.add(words[j]);
				}

			}

		}

		return list.toArray(new String[list.size()]);
	}

	public static void main(String[] args) {
		LeetCode0500 demo = new LeetCode0500();
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		demo.findWords(words);
	}
}
