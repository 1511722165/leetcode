package leetcode.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hw0002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        // 注意 hasNext 和 hasNextLine 的区别
        Set<Integer> set = new HashSet<>(a);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            a = in.nextInt();
            set.add(a);
        }

        Integer[] arr = set.toArray(new Integer[set.size()]);
        Arrays.sort(arr);
        Arrays.stream(arr).forEach((Integer b)-> {

            System.out.println(b);
        });
    }
}
