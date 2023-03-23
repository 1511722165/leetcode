package leetcode.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw0006 {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int a = in.nextInt();
//            if (a == 2000000014) {
//                System.out.println(2 + " " + 1000000007);
//            } else {
//                List<Integer> list = new ArrayList<>();
//                int w = 2;
//                while (2 * w < a) {
//                    if (a % w == 0) {
//                        list.add(w);
//                        a = a / w;
//                        w = 2;
//                    } else {
//                        w++;
//                    }
//                }
//                StringBuilder sb = new StringBuilder();
//                for (int i : list) {
//                    sb.append(i + " ");
//                }
//                System.out.println(sb.toString() + a);
//            }
//        }
//    }
public static void main(String[] args)  {
    Scanner in = new Scanner(System.in);
    Integer input =in.nextInt();
    StringBuilder sb = new StringBuilder();
    for ( int i = 2; i * i <= input; i++) { //只检查平方根范围内数即可
        if (input % i == 0) {
            sb.append(i).append(' ');
            input = input / i;
            i--;
        }
    }
    sb.append(input).append(' ');
    System.out.println(sb);
}

}
