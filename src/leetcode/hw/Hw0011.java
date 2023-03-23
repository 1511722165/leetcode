package leetcode.hw;

import java.util.Scanner;

public class Hw0011 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            StringBuilder sb =new StringBuilder(in.nextLine());
            System.out.println(sb.reverse());
        }
    }
}
