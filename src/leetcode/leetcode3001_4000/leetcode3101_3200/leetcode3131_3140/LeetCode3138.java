package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3131_3140;

import java.util.Arrays;

public class LeetCode3138 {

    public int minAnagramLength(String s) {
        int len = s.length();
        int[][] arr = new int[len + 1][26];
        int min = s.length(), res = 0;
        int j = 1;
        for (char c : s.toCharArray()) {
            for (int i = 0; i < 26; i++) {
                if (c - 'a' == i) {
                    arr[j][i] = arr[j - 1][i] + 1;
                } else {
                    arr[j][i] = arr[j - 1][i];
                }

            }
            arr[0][c - 'a']++;
            j++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[0][i] != 0) {
                min = Math.min(min, arr[0][i]);
            }
        }
        if (min == 1) return len;
        if (min == len) return 1;
        int n = 1;
        while (n < min) {
            if (min % n == 0) {
                //判断是否符合要求
                int step = len / (min / n);
                int index = 2;
                while (step * index <= len) {
                    for (int i = 0; i < 26; i++) {
                        if (arr[step][i] * index != arr[step * index][i]) {
                            step = len + 1;
                            break;
                        }

                    }
                    if (step * index == len) return step;
                    index++;
                }
            }
            n++;
        }

        return len;

    }

    public static void main(String[] args) {
        LeetCode3138 demo = new LeetCode3138();
        System.out.println(demo.minAnagramLength("abba"));
        System.out.println(demo.minAnagramLength("cdef"));
        System.out.println(demo.minAnagramLength("aabb"));
        System.out.println(demo.minAnagramLength("cccccccc"));

        System.out.println(demo.minAnagramLength("gqqggqgq"));
    }

}
