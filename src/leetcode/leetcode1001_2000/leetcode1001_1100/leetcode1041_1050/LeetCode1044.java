package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1041_1050;

import java.util.Arrays;

public class LeetCode1044 {
    public String longestDupSubstring(String s) {
        int len = 0;
        String res = "";
        for (int i = 0; i < 26; i++) {
            String demo = new String(s);
            char c = (char) (i + 97);
            int start = demo.indexOf(c);
            while (start >= 0) {
                demo = demo.substring(start);
                start = demo.indexOf(c);
                if (demo.lastIndexOf(c) != demo.indexOf(c)) {
                    for (int j = len; j < demo.length() - start - 1; j++) {
                        if (j + 1 <= demo.length() - j - 1) {
                            if (demo.indexOf(demo.substring(start, demo.length() - j - 1)) != demo
                                    .lastIndexOf(demo.substring(start, demo.length() - j - 1))
                                    && demo.length() - j - 1 > len) {
                                len = demo.length() - j - 1;
                                res = demo.substring(start, demo.length() - j - 1);

                            } else if (demo.indexOf(demo.substring(start, start + j + 1)) != demo
                                    .lastIndexOf(demo.substring(start, start + j + 1)) && start + j + 1 > len) {
                                len = j + 1;
                                res = demo.substring(start, j + start + 1);
                            }

                            else {
                                break;
                            }
                        } else {
                            break;
                        }

                    }
                }
                demo = demo.substring(start + 1);
                start = demo.indexOf(c);
            }
        }
        if (len == 0) {
            return "";
        }
        return res;
    }

    public  void main(String[] args) {
//        LeetCode1044 demo =new LeetCode1044();
//        System.out.println(demo.longestDupSubstring("banana"));




            int[] a={5,3,3,2,4,4,1,6,9,7,8,11};
            Arrays.stream(a).distinct().limit(8).filter(nums->nums%3==1).sorted().forEach(System.out::println);


    }
}
