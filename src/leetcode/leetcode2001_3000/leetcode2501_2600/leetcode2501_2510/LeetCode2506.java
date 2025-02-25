package leetcode.leetcode2001_3000.leetcode2501_2600.leetcode2501_2510;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2506 {

    char[] cs = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public int similarPairs(String[] words) {
        int res = 0;
        Map<String, Integer> map = new HashMap<String, Integer>(32);
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (word.indexOf(cs[i]) >= 0) {
                    sb.append(cs[i]);
                }
            }
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if(value>1){
                res+=(value*(value-1)/2);
            }

        }
        return res;
    }
}
