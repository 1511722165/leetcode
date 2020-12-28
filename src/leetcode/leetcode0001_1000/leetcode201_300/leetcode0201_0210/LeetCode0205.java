package leetcode.leetcode0001_1000.leetcode201_300.leetcode0201_0210;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0205 {

	// public boolean isIsomorphic(String s, String t) {
	// Map<Character, Character> map = new HashMap<>();
	// for (int i = 0; i < s.length(); i++) {
	// if (map.containsKey(s.charAt(i))) {
	// if (t.charAt(i) != map.get(s.charAt(i))) {
	// return false;
	// }
	//
	// } else {
	// if (map.containsValue(t.charAt(i))) {
	// return false;
	// }
	// map.put(s.charAt(i), t.charAt(i));
	// }
	//
	// }
	//
	// return true;
	// }
	// public boolean isIsomorphic(String s, String t) {
	// int a[] = new int[128];
	// int b[] = new int[128];
	// for (int i = 0; i < s.length(); i++) {
	// if (a[s.charAt(i)] != b[t.charAt(i)]) {
	// return false;
	// }
	// a[s.charAt(i)] = i+1;
	// b[t.charAt(i)] = i+1;
	// }
	//
	// return true;
	// }

	
	
	//单个 效率 charAt(i) 比toCharArray()快
	public boolean isIsomorphic(String s, String t) {
		int[] sint = new int[128];
		int[] tint = new int[128];
		char[] chars = s.toCharArray();
		char[] chart = t.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (sint[chars[i]] != tint[chart[i]]) {
				return false;
			}
			sint[chars[i]] = i + 1;
			tint[chart[i]] = i + 1;
		}
		return true;
	}

	public static void main(String[] args) {
		LeetCode0205 demo = new LeetCode0205();
		System.out.println(demo.isIsomorphic("egg", "add"));
	}

}
