package leetcode.leetcode2001_3000.leetcode2501_2600.leetcode2511_2520;

public class LeetCode2516 {

    public int takeCharacters(String s, int k) {
        char[] cs = s.toCharArray();
        int[] tar = {-k, -k, -k};
        for (char c : cs) tar[c - 'a']++;
        if (tar[0] < 0 || tar[1] < 0 || tar[2] < 0) return -1;
        if (tar[0] == 0 && tar[1] == 0 && tar[2] == 0) return cs.length;
        int l = 0, r = 0, res = 0;
        int[] cnt = new int[3]; // any cnt[i] <= tar[i] && maximize (r - l)
        while (r < cs.length) {
            cnt[cs[r++] - 'a']++;
            if (cnt[0] > tar[0] || cnt[1] > tar[1] || cnt[2] > tar[2]) {
                cnt[cs[l++] - 'a']--;
            } else {
                res = res > r - l ? res : r - l;
            }
        }
        return cs.length - res;
    }
}
