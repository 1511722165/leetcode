package leetcode.leetcode0001_1000.leetcode701_800.leetcode0741_0750;

import java.util.Arrays;

public class LeetCode0748 {

	public String shortestCompletingWord(String licensePlate, String[] words) {
		int[] c = new int[26];
		int count = 0;
		int flag = -1;
		boolean tf = false;
		int ifg = 0;
		for (int i = 0; i < licensePlate.length(); i++) {
			if (licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z') {
				c[licensePlate.charAt(i) - 'a']++;
				count++;
			} else if (licensePlate.charAt(i) >= 'A' && licensePlate.charAt(i) <= 'Z') {
				c[licensePlate.charAt(i) - 'A']++;
				count++;
			}
		}
		for (int i = 0; i < words.length; i++) {

			if (flag > 0 && (count + flag) > words[i].length()) {

				int[] temp = Arrays.copyOf(c, 26);
				for (int j = 0; j < words[i].length(); j++) {
					temp[words[i].charAt(j) - 'a']--;
				}
				tf = true;
				for (int item : temp) {
					if (item > 0) {
						tf = false;
						break;
					}
				}
				if (tf) {

					if (flag > words[i].length() - count) {
						ifg = i;
						flag = words[i].length() - count;
						if (flag == 0) {
							return words[i];
						}
					}

				}

			} else if (flag < 0 && count <= words[i].length()) {
				int[] temp = Arrays.copyOf(c, 26);
				for (int j = 0; j < words[i].length(); j++) {
					temp[words[i].charAt(j) - 'a']--;
				}
				tf = true;
				for (int item : temp) {
					if (item > 0) {
						tf = false;
						break;
					}
				}
				if (tf) {
					flag = words[i].length() - count;
					if (flag == 0) {
						return words[i];
					}
					ifg = i;
				}

			}

		}

		return words[ifg];

	}
}
