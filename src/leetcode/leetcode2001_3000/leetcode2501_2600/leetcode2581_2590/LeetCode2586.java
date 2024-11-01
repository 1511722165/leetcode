package leetcode.leetcode2001_3000.leetcode2501_2600.leetcode2581_2590;

public class LeetCode2586 {

    public int vowelStrings(String[] words, int left, int right) {
        int res = 0;
        for (int i = left; i <=right ; i++) {
            char[] cs = words[i].toCharArray();
            int n = cs.length - 1;
            if ((cs[0] == 'a' || cs[0] == 'e' || cs[0] == 'i' || cs[0] == 'o' || cs[0] == 'u')
             && (cs[n] == 'a' || cs[n] == 'e' || cs[n] == 'i' || cs[n] == 'o' || cs[n] == 'u')) {
                res++;
            }
        }
        return res;
    }
}
