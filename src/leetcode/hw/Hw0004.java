package leetcode.hw;

import java.util.Scanner;

public class Hw0004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            int add = s.length() % 8;
            if (add > 0) {
                for (int i = 0; i < 8 - add; i++) {
                    s = s + "0";
                }
            }
            for (int i = 0; i < s.length() / 8; i++) {
                System.out.println(s.substring(i * 8, 8*(i+1)));
            }
        }
    }
}
