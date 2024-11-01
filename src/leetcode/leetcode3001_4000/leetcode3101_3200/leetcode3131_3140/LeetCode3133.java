package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3131_3140;

public class LeetCode3133 {

    public long minEnd(int n, int x) {
        String s = Integer.toBinaryString(x);
        char[] cs = s.toCharArray();
        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '0') {
                count++;
            }
        }
        if (n - 1 <= ((1 << count) - 1)) {
            int c = ((1 << count) - 1) & (n - 1);
            String s1 = Integer.toBinaryString(c);
            StringBuilder sb = new StringBuilder();
            char[] cs1 = s1.toCharArray();
            for (int i = cs.length - 1, j = cs1.length - 1; i >= 0 && j >= 0; i--) {
                if (cs[i] == '0') {
                    cs[i] = cs1[j];
                    j--;
                }
            }
            sb.append(cs);
            return Long.parseLong(sb.toString(), 2);
        } else {
            StringBuilder sb = new StringBuilder();
            if (count > 0) {
                int shang = ((n - 1) % ((1 << count)));
                String yushu = Integer.toBinaryString(((n - 1) / ((1 << count))));
                int c = ((1 << count) - 1) & (shang);
                String s1 = Integer.toBinaryString(c);
                char[] cs1 = s1.toCharArray();
                for (int i = cs.length - 1, j = cs1.length - 1; i >= 0 && j >= 0; i--) {
                    if (cs[i] == '0') {
                        cs[i] = cs1[j];
                        j--;
                    }
                }
                sb.append(yushu);
                sb.append(cs);
            } else {
                String s1 = Integer.toBinaryString(n - 1);
                sb.append(s1);
                sb.append(cs);
            }
            return Long.parseLong(sb.toString(), 2);
        }
    }

    public static void main(String[] args) {
        LeetCode3133 demo = new LeetCode3133();
//        System.out.println(demo.minEnd(3,4));
//        System.out.println(demo.minEnd(2, 7));
        System.out.println(demo.minEnd(4, 2));
        System.out.println(demo.minEnd(3, 2));
    }
}
