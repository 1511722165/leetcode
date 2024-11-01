package leetcode.hw;

import java.util.Scanner;

public class Hw0013 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s  = in.nextLine();
            String[] arr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]+" ");
            }
            System.out.println(sb.toString());
        }
    }
}
