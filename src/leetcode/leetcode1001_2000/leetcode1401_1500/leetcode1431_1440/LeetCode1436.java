package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1431_1440;

import java.util.*;

public class LeetCode1436 {

    public String destCity(List<List<String>> paths) {
        Map map = new HashMap(128);
        for (List<String> item : paths) {
            map.put(item.get(0), item.get(1));
        }
        Iterator iterator = map.values().iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value);
            if (map.get(value) == null) {
                return value.toString();
            }
        }
        return "";
    }

}
