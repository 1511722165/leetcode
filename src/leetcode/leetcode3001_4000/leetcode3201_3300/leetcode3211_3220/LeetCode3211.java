package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3211_3220;

import java.util.ArrayList;
import java.util.List;

public class LeetCode3211 {

        public List<String> validStrings(int n) {
            List<String> list = new ArrayList<>();
            dfs(1 << n, n-1, list);
            return list;
        }
        private void dfs(int p, int bit, List<String> list) {
            if (bit < 0) {
                String s = Integer.toBinaryString(p);
                list.add(s.substring(1));
                return;
            }
            dfs(p|(1 << bit), bit-1, list);
            if ((p & (1 << (bit+1))) != 0) {
                dfs(p, bit-1, list);
            }
        }

    public static void main(String[] args) {
        LeetCode3211 demo=new LeetCode3211();
        demo.validStrings(5);

    }

}
