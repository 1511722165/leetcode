package leetcode.hw;

import java.util.Scanner;

/**
 * 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
 * 小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
 * 数据范围：输入的正整数满足 1 \le n \le 100 \1≤n≤100
 */
public class hw0001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int m = a % 3;
            a = a / 3;
            int res = 0;
            while (a > 0) {
                res += a;
                a = m + a;
                m = a % 3;
                a = a / 3;
            }
            if (m == 2) {
                res++;
            }
            if (res > 0) {
                System.out.println(res);
            }
        }
    }
}
