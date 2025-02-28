package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1471_1480;

import java.util.LinkedList;

public class LeetCode1472 {

    int left;
    int right;
    int index;
    String[] list;

    public LeetCode1472(String homepage) {
        list = new String[5000];
        list[0] = homepage;
        right =index=left= 0;

    }

    public void visit(String url) {
        list[++index] = url;
        ++left;
        right = 0;

    }

    public String back(int steps) {
        if (steps > left) {
            right = right + left;
            left =index= 0;

        } else {
            left = left - steps;
            right = right + steps;
            index = index - steps;

        }
        return list[index];
    }

    public String forward(int steps) {
        if (steps > right) {
            index = index + right;
            left = left + right;
            right = 0;

        } else {
            index = index + steps;
            right = right - steps;
            left = left + steps;

        }
        return list[index];
    }

    public static void main(String[] args) {
        LeetCode1472 demo = new LeetCode1472("leetcode.com");
        demo.visit("google.com");
        demo.visit("facebook.com");
        demo.visit("youtube.com");

        System.out.println(demo.back(1));
        System.out.println(demo.back(1));
        System.out.println(demo.forward(1));

        demo.visit("linkedin.com");

        System.out.println(demo.forward(2));

        System.out.println(demo.back(2));
        System.out.println(demo.back(7));
    }


}
