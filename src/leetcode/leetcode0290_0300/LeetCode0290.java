package leetcode.leetcode0290_0300;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0290 {

	public boolean wordPattern(String pattern, String s) {
		int i = 97;
		int l = 97;
		char[] cs = pattern.toCharArray();
		String[] strs = s.split(" ");
		int length = cs.length;
		Map<String, Integer> map = new HashMap<>(length);
		Map<Character, Integer> mapcs=new HashMap<>();
		StringBuilder ctr = new StringBuilder();
		StringBuilder str = new StringBuilder();
		if(cs.length!=strs.length){
			return false;
		}
		if (strs.length == 1) {
			return true;
		} 
		
		for (int a = 0; a < strs.length; a++) {
			if (!map.containsKey(strs[a])) {
				str = str.append((char) i);
				map.put(strs[a],  i);
				i++;
			} else {
				str = str.append(map.get(strs[a]));
			}
			
			
			if (!mapcs.containsKey(cs[a])) {
				ctr = ctr.append((char) l);
				mapcs.put(cs[a],  l);
				l++;
			} else {
				ctr = ctr.append(mapcs.get(cs[a]));
			}
		}
		if(ctr.toString().equals(str.toString())){
			return true;
		}
		return false;
	}
}

