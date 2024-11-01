package leetcode.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hw0003 {



    /**
     * 明明生成了NN个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
     *
     * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，输入的数字大小满足 1 \le val \le 500 \1≤val≤500
     * 输入描述：
     * 第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。 具体格式可以参考下面的"示例"。
     * 输出描述：
     * 输出多行，表示输入数据处理后的结果
     * @param args
     */
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
