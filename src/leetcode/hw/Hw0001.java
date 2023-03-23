package leetcode.hw;

import java.util.Scanner;

/**
 * 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
 * 小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
 * 数据范围：输入的正整数满足 1 \le n \le 100 \1≤n≤100
 */
public class Hw0001 {
//    计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
//    输入描述：
//    输入一行，代表要计算的字符串，非空，长度小于5000。
//
//    输出描述：
//    输出一个整数，表示输入字符串最后一个单词的长度。

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            if(a.lastIndexOf(' ')<0){System.out.println(a.length());}
            else{System.out.println(a.length() - a.lastIndexOf(' ')-1);}
        }
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int a = in.nextInt();
//            int m = a % 3;
//            a = a / 3;
//            int res = 0;
//            while (a > 0) {
//                res += a;
//                a = m + a;
//                m = a % 3;
//                a = a / 3;
//            }
//            if (m == 2) {
//                res++;
//            }
//            if (res > 0) {
//                System.out.println(res);
//            }
//        }
//    }
}
